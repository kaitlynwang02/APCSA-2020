package project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import example.Entity;

public abstract class MovingThing {

	private Coordinate position;
	private Velocity velocity;
	private int size;
	private Color color;
	private boolean alive = true;

	public MovingThing() {
		this(new Coordinate(0, 0));
	}

	public MovingThing(Coordinate position) {
		this(position, 20);
	}

	public MovingThing(Coordinate position, int size) {
		this(position, size, Color.BLACK);
	}

	public MovingThing(Coordinate position, int size, Color color) {
		this.position = position;
		this.size = size;
		this.color = color;
		this.velocity = new Velocity(0, 0);
	}

	public abstract int interactWith(MovingThing MovingThing);

	public void kill() {
		alive = false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Coordinate getPosition() {
		return position;
	}

	public double getX() {
		return position.getX();
	}

	protected void setX(double x) {
		if (x >= 0 && x <= Background.COLUMNS)
			position.setX(x);
		if (x < 0)
			position.setX(0);
		if (x > Background.COLUMNS)
			position.setX(Background.COLUMNS);
	}

	public double getY() {
		return position.getY();
	}

	protected void setY(double y) {
		if (y >= 0 && y <= Background.ROWS)
			position.setY(y);
		if (y < 0)
			position.setY(0);
		if (y > Background.ROWS)
			position.setY(Background.ROWS);
	}

	public int getSize() {
		return size;
	}

	protected void snapToX() {
		setX(Math.round(position.getX()));
	}

	protected void snapToY() {
		setY(Math.round(position.getY()));
	}

	protected void snapToCoordinate() {
		snapToX();
		snapToY();
	}

	protected void moveX(double distance) {
		setX(position.getX() + distance);
	}

	protected void moveY(double distance) {
		setY(position.getY() + distance);
	}

	protected void move(double distance, double direction) {
		if (direction == Direction.NORTH)
			moveY(distance);
		else if (direction == Direction.SOUTH)
			moveY(-1 * distance);
		else if (direction == Direction.EAST)
			moveX(distance);
		else if (direction == Direction.WEST)
			moveX(-1 * distance);
	}

	public Velocity getVelocity() {
		return velocity;
	}

	public void move() {
		moveX(Math.cos(velocity.getAngle()) * velocity.getSpeed());
		moveY(Math.sin(velocity.getAngle()) * velocity.getSpeed());
	}

	public void move(Velocity velocity) {
		setVelocity(velocity);
		move();
	}

	protected void setVelocity(Velocity velocity) {
		this.velocity = velocity;
	}

	public boolean onEdgeX() {
		return position.getX() == 0 || position.getX() == Background.COLUMNS + 1;
	}

	public boolean onEdgeY() {
		return position.getY() == 0 || position.getY() == Background.ROWS + 1;
	}

	public boolean onEdge() {
		return onEdgeX() || onEdgeY();
	}

	public boolean onCorner() {
		return onEdgeX() && onEdgeY();
	}

	public boolean atBase() {
		return atBase(0.1);
	}

	public boolean atBase(double error) {
		return Math.abs(getX() - 5) < error && Math.abs(getY() - 3.5) < error;
	}

	public boolean isAlive() {
		return alive;
	}

	public boolean isDead() {
		return !isAlive();
	}

}
