package project;

import java.util.List;

public class Coordinate {

	private double x;
	private double y;

	public Coordinate() {
		this(0, 0);
	}

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double angleTo(Coordinate coord) {
		double deltaY = coord.getY() - this.getY();
		double deltaX = coord.getX() - this.getX();
		if (deltaX > 0)
			return Math.atan(deltaY / deltaX);
		return Math.atan(deltaY / deltaX) + Math.PI;
	}

	public double distanceTo(Coordinate coord) {
		double deltaX = coord.getX() - this.getX();
		double deltaY = coord.getY() - this.getY();
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

	public Coordinate closestTo(List<Coordinate> coords) {
		if (coords.size() <= 0)
			return null;
		Coordinate closest = coords.get(0);
		for (Coordinate coord : coords)
			if (this.distanceTo(coord) < this.distanceTo(closest))
				closest = coord;
		return closest;
	}

	public String toString() {
		return "Coordinate: {x: " + getX() + ", y: " + getY() + "}";
	}
}
