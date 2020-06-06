package project;

public class Square {

	private int x;
	private int y;
	private Tower Tower;

	public Square(int x, int y) {
		this(x, y, null);
	}

	public Square(int x, int y, Tower Tower) {
		this.x = x;
		this.y = y;
		this.Tower = Tower;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setTower(Tower Tower) {
		this.Tower = Tower;
	}

	public Tower getTower() {
		return Tower;
	}
}
