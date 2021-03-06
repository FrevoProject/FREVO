package components.controllers;


import java.awt.geom.Point2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

import components.cdrones.Drone;
import components.cdrones.DronesServer;
import components.cdrones.cdrones;
import core.AbstractRepresentation;
import net.jodk.lang.FastMath;

/** Controller which uses only the relative position of the drones within range */
public class DiscreteOutputEvolvedController extends DroneController {

	private ArrayList<Float> input = new ArrayList<Float>();
	private ArrayList<Float> output = new ArrayList<Float>();
	private double radiodata = 0;
	private double[] sensordata;

	// all the drones share the same controller for repeatability
	static Random generator;

	/** Contains a list of coordinates of the other drones */
	private ArrayList<Drone> dronesInRadioRange;

	public DiscreteOutputEvolvedController(AbstractRepresentation rep, cdrones parent) {
		this.representation = rep;
		generator = parent.getRandom();
	}

	@Override
	public void postInfo() {
		input.clear();

		// add 4 directional receiver inputs
		// sort drones
		ArrayList<Drone> tl = new ArrayList<Drone>();
		ArrayList<Drone> tr = new ArrayList<Drone>();
		ArrayList<Drone> bl = new ArrayList<Drone>();
		ArrayList<Drone> br = new ArrayList<Drone>();

		Point2D.Double pos = drone.getPosition();
		for (Drone d : dronesInRadioRange) {
			Point2D.Double opos = d.getPosition();

			DiscreteOutputEvolvedController c = (DiscreteOutputEvolvedController) d.getController();

			if (opos.x >= pos.x) {
				// right side
				if (opos.y > pos.y) {
					// top
					if (c.getRadioData() > 0) {
						tr.add(d);
						this.drone.RADIO_TR_ON = true;
					}
				} else {
					// bottom
					if (c.getRadioData() > 0) {
						br.add(d);
						this.drone.RADIO_BR_ON = true;
					}
				}
			} else {
				// left side
				if (opos.y > pos.y) {
					// top
					if (c.getRadioData() > 0) {
						tl.add(d);
						this.drone.RADIO_TL_ON = true;
					}
				} else {
					// bottom
					if (c.getRadioData() > 0) {
						bl.add(d);
						this.drone.RADIO_BL_ON = true;
					}
				}
			}
		}

		double tldist = -1;
		double trdist = -1;
		double bldist = -1;
		double brdist = -1;

		if (tl.size() > 0) {
			// get the nearest
			tldist = Double.MAX_VALUE;
			for (Drone od : tl) {
				double d = DronesServer.getDistance(drone, od);
				if (d < tldist) {
					tldist = d;
					// tlclosest = od;
				}
			}
		}

		if (tr.size() > 0) {
			// get the nearest
			trdist = Double.MAX_VALUE;
			for (Drone od : tr) {
				double d = DronesServer.getDistance(drone, od);
				if (d < trdist) {
					trdist = d;
					// trclosest = od;
				}
			}
		}

		if (bl.size() > 0) {
			// get the nearest
			bldist = Double.MAX_VALUE;
			for (Drone od : bl) {
				double d = DronesServer.getDistance(drone, od);
				if (d < bldist) {
					bldist = d;
					// blclosest = od;
				}
			}
		}

		if (br.size() > 0) {
			// get the nearest
			brdist = Double.MAX_VALUE;
			for (Drone od : br) {
				double d = DronesServer.getDistance(drone, od);
				if (d < brdist) {
					brdist = d;
					// brclosest = od;
				}
			}
		}

		if (tldist != -1) {
			if (tldist != 0)
				input.add(1.0f / (float) tldist);
			else
				input.add(Float.MAX_VALUE);
		} else {
			input.add(0f);
		}

		if (trdist != -1) {
			if (trdist != 0)
				input.add(1.0f / (float) trdist);
			else
				input.add(Float.MAX_VALUE);
		} else {
			input.add(0f);
		}

		if (bldist != -1) {
			if (bldist != 0)
				input.add(1.0f / (float) bldist);
			else
				input.add(Float.MAX_VALUE);
		} else {
			input.add(0f);
		}

		if (brdist != -1) {
			if (brdist != 0)
				input.add(1.0f / (float) brdist);
			else
				input.add(Float.MAX_VALUE);
		} else {
			input.add(0f);
		}

		// add own position
		input.add((float) pos.x / DronesServer.FIELDDIM.x);
		input.add((float) pos.y / DronesServer.FIELDDIM.y);

		// add own direction
		double dir = drone.getBodyDirection();
		float dx = (float) FastMath.cos(dir);
		float dy = (float) FastMath.sin(dir);

		input.add(dx);
		input.add(dy);

		// add 4 wall detector
		if (sensordata[0] <= Drone.DETECTION_RANGE)
			input.add(1.0f / (float) sensordata[0]);
		else
			input.add(0f);

		if (sensordata[1] <= Drone.DETECTION_RANGE)
			input.add(1.0f / (float) sensordata[1]);
		else
			input.add(0f);

		if (sensordata[2] <= Drone.DETECTION_RANGE)
			input.add(1.0f / (float) sensordata[2]);
		else
			input.add(0f);

		if (sensordata[3] <= Drone.DETECTION_RANGE)
			input.add(1.0f / (float) sensordata[3]);
		else
			input.add(0f);

		// get network output
		output.clear();
		output = representation.getOutput(input);


		int binarydigits = output.size() -1;
		int sum = 0;
		
		for (int i=0;i<binarydigits;i++) {
			if (output.get(i) > 0.5) {
				sum += 1 << i;
			}
		}

		double angle = 45 + 360.0/(1<<binarydigits) * sum;
		
		if (cdrones.allowCommunications)
			this.radiodata = output.get(2);
		else
			this.radiodata = 0;

		// printVector(input);
		// System.out.println();
		// printVector(output);
		// System.out.println();


		this.drone.dashto(100, angle);
	}

	@Override
	public void preInfo() {
		// nothing to reset
	}

	public void addDronesInRadioRange(ArrayList<Drone> drones) {
		this.dronesInRadioRange = drones;
	}

	public double getRadioData() {
		return radiodata;
	}

	/**
	 * prints a nicely formatted comma-separated vector of floats auxiliary
	 * function for debugging purposes
	 * 
	 * @param data
	 *            a vector of float values
	 */
	void printVector(ArrayList<Float> data) {
		DecimalFormat fm = new DecimalFormat("0.00");
		String sep = "";
		for (int i = 0; i < data.size(); i++) {
			System.out.print(sep + fm.format(data.get(i)));
			sep = "; ";
		}
	}

	/**
	 * Bumper sensor data in the following order: top-left, top-right,
	 * bottom-left, bottom right
	 */
	public void addSensorData(double[] distancelist) {
		this.sensordata = distancelist;
		// System.out.println
		// (distancelist[0]+", "+distancelist[1]+", "+distancelist[2]+", "+distancelist[3]);
	}

	public void reportFailedMove() {
		// System.err.println("Obstacle detected");
	}

}
