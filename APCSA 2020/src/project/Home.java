package project;

public class Home {

	public static final int MAX_Home_HEALTH = 10;
	private int health = MAX_Home_HEALTH;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void damage() {
		damage(1);
	}

	public void damage(int amount) {
		if (health > 0)
			health -= amount;
	}

	public boolean alive() {
		return health > 0;
	}

	public boolean dead() {
		return !alive();
	}

	public int getPercentDamaged() {
		return (int) ((((double) (MAX_Home_HEALTH - health)) / MAX_Home_HEALTH) * 100);
	}
}
