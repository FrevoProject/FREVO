package spiderinoLight;

import java.util.Hashtable;

import components.simplesoccer.SimpleDisplay;
import components.simplesoccer.SimpleServer;
import components.simplesoccer.SimpleSoccer.DisplayWorker;

import core.AbstractRepresentation;
import core.AbstractSingleProblem;
import core.XMLFieldEntry;

/**
  * @author Sergii Zhevzhyk
 *
 */
public class SpiderinoLight extends AbstractSingleProblem {

	/** Number of total simulation steps */
	public int stepnumber;
	/** Indicates if the display should be turned on */
	public boolean withmonitor;
	/**
	 * Indicates if the game should be paused between each step to allow visual
	 * representation
	 */
	public boolean withpause;

	/**
	 * Indicates if the game should be saved as a set of images
	 */
	public boolean withsave;
	
	public boolean runSimulation = true;
	
	public int aktStep;
	
	private AbstractRepresentation candidate;
	
	@Override
	protected double evaluateCandidate(AbstractRepresentation candidate) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see core.AbstractSingleProblem#replayWithVisualization(core.AbstractRepresentation)
	 */
	@Override
	public void replayWithVisualization(AbstractRepresentation candidate) {
		this.candidate = candidate;
		this.simpleserver = new SimpleServer(this);

		display = new SimpleDisplay(this);

		sw = new DisplayWorker();
		withpause = true;
		withmonitor = true;
		sw.execute();
	}

	@Override
	public double getMaximumFitness() {
		return Double.MAX_VALUE;
	}
	
	@Override
	public Hashtable<String, XMLFieldEntry> adjustRequirements(
			Hashtable<String, XMLFieldEntry> requirements,
			Hashtable<String, XMLFieldEntry> properties) {

		XMLFieldEntry inputnumber = requirements.get("inputnumber");
		int input = 3;
		
		inputnumber.setValue(Integer.toString(input));

		return requirements;
	}
}
