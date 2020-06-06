package project;

import java.awt.Color;

public class Alien extends MovingThing {

	private int damage = 0;
	private double direction = Direction.getRandomDirection();
	private int speed;
	private int health;

	public Alien() {
		this(getRandomValidStartingCoordinate());
	}

	public Alien(Coordinate position) {
		this(position, 1);
	}

	public Alien(Coordinate position, int speed) {
		this(position, speed, 1);
	}

	public Alien(Coordinate position, int speed, int health) {
		super(position, 15, Color.RED);
		this.speed = speed;
		this.health = health;
	}

	public void damage() {
		damage(1);
	}

	public void damage(int damage) {
		health -= damage;
		if (health <= 0)
			kill();
	}

	public void tick() {
		double moveDistance = ((double) speed) * 0.01;

		if (approachingJunction()) {
			snapToCoordinate();

			if (getY() > 4)
				direction = Direction.SOUTH;
			else if (getY() < 4)
				direction = Direction.NORTH;
			else if (getX() < 5)
				direction = Direction.EAST;
			else if (getX() > 5)
				direction = Direction.WEST;
			else
				direction = Direction.SOUTH;

			setVelocity(new Velocity(moveDistance, direction));
		}
		move();
	}

	public int getHealth() {
		return health;
	}

	public boolean approachingJunction() {
		double error = 0.05;
		if (direction == Direction.NORTH && Math.abs(getY() - Math.ceil(getY())) < error)
			return true;
		if (direction == Direction.SOUTH && Math.abs(getY() - Math.floor(getY())) < error)
			return true;
		if (direction == Direction.EAST && Math.abs(getX() - Math.ceil(getX())) < error)
			return true;
		if (direction == Direction.WEST && Math.abs(getX() - Math.floor(getX())) < error)
			return true;
		return false;

	}

	public static Coordinate getRandomValidStartingCoordinate() {
		Coordinate coord;
		double side = Direction.getRandomDirection();
		if (side == Direction.NORTH) {
			coord = new Coordinate(Math.floor(Math.random() * Background.COLUMNS), 0);
		} else if (side == Direction.SOUTH) {
			coord = new Coordinate(Math.floor(Math.random() * Background.COLUMNS), Background.ROWS);
		} else if (side == Direction.WEST) {
			coord = new Coordinate(0, Math.floor(Math.random() * Background.ROWS));
		} else {
			coord = new Coordinate(Background.COLUMNS, Math.floor(Math.random() * Background.ROWS));
		}
		return coord;
	}

	@Override
	public int getSize() {
		return super.getSize() + 3 * (health - 1);
	}

	@Override
	public int interactWith(MovingThing MovingThing) {
		return 0;
	}

}
