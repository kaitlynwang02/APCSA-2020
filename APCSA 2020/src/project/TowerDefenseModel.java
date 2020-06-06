package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

public class TowerDefenseModel {

	private int money;
	private int totalKills;
	private int totalKillsWhenLevelChanged;
	private int level = 1;
	private boolean paused = false;
	private boolean gameOver = false;
	private Timer update;
	private Background Background = new Background();
	private ArrayList<MovingThing> movingthings = new ArrayList<MovingThing>();
	private ArrayList<Alien> Aliens = new ArrayList<Alien>();
	private ArrayList<Tower> Towers = new ArrayList<Tower>();
	private Alien alien;

	public boolean isGameOver() {
		return gameOver;
	}

	public void restart() {
		start();
	}

	public void start() {

		money = 50;

		totalKills = 0;

		totalKillsWhenLevelChanged = 0;
		level = 1;
		paused = false;
		gameOver = false;

		movingthings.clear();
		Aliens.clear();
		Towers.clear();
		Background = new Background();
	}

	public void advanceLevel() {
		level++;
	}

	private void gameOver() {
		gameOver = true;
	}

	private void updateLevel() {
		if (totalKills - totalKillsWhenLevelChanged > 30) {
			level++;
			totalKillsWhenLevelChanged = totalKills;
		}
	}

	public int getScore() {
		return totalKills;
	}

	private int currentAlienHealth() {
		return (int) ((level * 0.3) + 1);
	}

	public void purchase(Purchasable item) {
		if (money >= item.getBasePrice()) {
			if (item instanceof Tower) {

				if (addTower((Tower) item)) {
					money -= item.getValue();
					return;
				}
			}
		}
	}

	public boolean sell(SquareCoordinate position) {
		int value = Background.getTowerAt(position).getValue();
		removeTower(Background.getTowerAt(position));
		money += value * 0.2;

		return true;
	}

	private boolean addTower(Tower Tower) {
		if (Tower.getX() > Background.COLUMNS - 1)
			return false;
		if (Tower.getY() > Background.ROWS - 1)
			return false;
		Towers.add(Tower);
		Background.setTower(Tower);
		return true;
	}

	private void removeTower(Tower Tower) {
		Towers.remove(Tower);
		Background.removeTower(Tower);
	}

	public int getMoney() {
		return money;
	}

	private void removeDeadMovingThings() {
		for (int i = 0; i < movingthings.size(); i++) {
			if (movingthings.get(i).isDead()) {
				despawn(movingthings.get(i));
				i--;
			}
		}
	}

	private void spawnBullets(Bullet Bullets) {
		if (Bullets == null)
			return;
		movingthings.add(Bullets);
	}

	private void spawnAlien(double probability) {
		if (Math.random() <= probability)
			spawnAlien();
	}

	private void spawnAlien() {
		Alien Alien = new Alien(alien.getRandomValidStartingCoordinate(), 3, currentAlienHealth());
		movingthings.add(Alien);
		Aliens.add(Alien);
	}

	private void despawn(MovingThing MovingThing) {
		if (MovingThing instanceof Alien)
			Aliens.remove(MovingThing);
		movingthings.remove(MovingThing);
	}

	public Background getBackground() {
		return Background;
	}

	public List<MovingThing> getMovingThings() {
		return movingthings;
	}

}
