package project;

public class Background {

	public static final int ROWS = 7;
	public static final int COLUMNS = 10;

	private Square[][] squares;
	private Home Home = new Home();

	public Background() {
		squares = new Square[ROWS][COLUMNS];
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS; col++) {
				squares[row][col] = new Square(col, row);
			}
		}
	}

	public Home getHome() {
		return Home;
	}

	public Square[][] getSquares() {
		return squares;
	}

	public Square getSquare(SquareCoordinate position) {
		return squares[position.getY()][position.getX()];
	}

	public void setTower(Tower Tower) {
		getSquare(Tower.getPosition()).setTower(Tower);
	}

	public Tower removeTower(Tower Tower) {
		getSquare(Tower.getPosition()).setTower(null);
		return Tower;
	}

	public Tower getTowerAt(SquareCoordinate position) {
		return getSquare(position).getTower();
	}

	public boolean withinBounds(SquareCoordinate position) {
		if (position.getX() < 0 || position.getX() > COLUMNS - 1)
			return false;
		if (position.getY() < 0 || position.getY() > ROWS - 1)
			return false;
		return true;
	}
}
