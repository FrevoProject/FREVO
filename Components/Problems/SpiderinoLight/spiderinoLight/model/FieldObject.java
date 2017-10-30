package spiderinoLight.model;

import java.awt.geom.Point2D;

import spiderinoLight.model.GameObject;

public class FieldObject extends GameObject {

	public Point2D.Double position;
	
	public FieldObject (Point2D.Double pos) {
		this.position = pos;
	}
	
	public Point2D.Double getPosition() {
		return this.position;
	}
	
	public void setPosition (Point2D.Double pos) {
		this.position = pos;
	}	
}
