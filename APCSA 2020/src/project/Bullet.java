package project;

import java.awt.Color;
import java.util.List;

public abstract class Bullet extends MovingThing {

	private Tower source;

	public Bullet(Tower source, Coordinate position) {
		this(source, position, Color.BLUE);
	}

	public Bullet(Tower source, Coordinate position, Color color) {
		super(position, 10, color);
		this.source = source;
	}

	public Tower getSource() {
		return source;
	}

	@Override
	public int interactWith(MovingThing MovingThing) {
		if (MovingThing instanceof Alien) {
			((Alien) MovingThing).damage(getSource().getDamage());
			kill();
			return (MovingThing.isAlive()) ? 0 : 1;
		}
		return 0;
	}

	@Override
	public void setX(double x) {
		if (x < 0 || x > Background.COLUMNS)
			kill();
		else
			super.setX(x);
	}

	@Override
	public void setY(double y) {
		if (y < 0 || y > Background.ROWS)
			kill();
		else
			super.setY(y);
	}
}
