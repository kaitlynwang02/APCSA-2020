package project;

import java.util.ArrayList;
import java.util.List;

public abstract class Tower implements Purchasable {

	private SquareCoordinate position;
	private int cooldown;

	public Tower(SquareCoordinate position) {
		this(position, 1);
	}

	public Tower(SquareCoordinate position, int cooldown) {
		this.position = position;
		this.cooldown = cooldown;
	}

	public Bullet fire(List<Alien> aliens, long tick) {
		return getBullet(aliens);
	}

	public abstract Bullet getBullet(List<Alien> aliens);

	public int getX() {
		return position.getX();
	}

	public int getY() {
		return position.getY();
	}

	public int getDamage() {
		return 1;
	}

	public SquareCoordinate getPosition() {
		return position;
	}

	public int getValue() {
		return getBasePrice();
	}

}
