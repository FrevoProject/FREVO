package spiderinoLight.model;

public class GameObject {
	
	public double distance;
	
	public double getDistance() {
		return this.distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * Returns the type of the object
	 * @return 0 if undefined, 1 if player, 2 if ball, 3 if line, 4 if goal
	 */
	public int getType() {
		return 0;
	}
}
