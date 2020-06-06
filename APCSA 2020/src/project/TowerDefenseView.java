package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TowerDefenseView extends JFrame {

	public final int WIDTH = 1280;
	public final int HEIGHT = 720;

	private GamePanel gamePanel;
	private ControlPanel controlPanel;

	private TowerDefenseModel model;
	private ArrayList<JRadioButton> storeButtons = new ArrayList<JRadioButton>();
	private long purchaseErrorMessageShown;
	private SquareCoordinate selectedSquare;

	public TowerDefenseView() {

		gamePanel = new GamePanel();
		controlPanel = new ControlPanel();
		gamePanel.setPreferredSize(new Dimension(WIDTH - 260, HEIGHT));
		controlPanel.setPreferredSize(new Dimension(260, HEIGHT));

		this.add(gamePanel, BorderLayout.WEST);
		this.add(controlPanel, BorderLayout.EAST);

		this.setSize(1280, 720);
		this.setTitle("Tower Defense");
		this.setResizable(false);
		this.setVisible(true);

		this.requestFocus();
	}

	public void setSelectedSquare(SquareCoordinate selectedSquare) {
		this.selectedSquare = selectedSquare;
	}

	public List<JRadioButton> getStoreButtons() {
		return storeButtons;
	}

	public JTextField getNameTextField() {
		return gamePanel.getNameTextField();
	}

	private class GamePanel extends JPanel {

		private JTextField name = new JTextField("Name");

		public GamePanel() {
			this.setLayout(null);
			this.add(name);
			name.setVisible(false);
			name.setSize(500, 100);
			name.setFont(new Font("Helvetica", 0, 80));
			name.setLocation(100, 600);
		}

		public JTextField getNameTextField() {
			return name;
		}

		public void paintComponent(Graphics g) {
			if (model == null)
				return;

			Square[][] squares = model.getBackground().getSquares();
			int width = 100;
			for (int row = 0; row < squares.length; row++) {
				for (int col = 0; col < squares[row].length; col++) {
					g.setColor(Color.LIGHT_GRAY);
					g.drawRect(col * width + 10, row * width + 10, width, width);

					if (squares[row][col].getTower() != null) {
						Tower tower = squares[row][col].getTower();

						int towerWidth = 20 * 6;

						g.fillOval(tower.getX() * 100 + 50 + 10 - towerWidth / 2,
								tower.getY() * 100 + 50 + 10 - towerWidth / 2, towerWidth, towerWidth);
						g.setColor(Color.BLACK);

					}
				}
			}

			for (MovingThing MovingThing : model.getMovingThings()) {
				g.setColor(MovingThing.getColor());
				int x = (int) (MovingThing.getX() * width + 10 - MovingThing.getSize() / 2);
				int y = (int) (MovingThing.getY() * width + 10 - MovingThing.getSize() / 2);
				g.fillOval(x, y, MovingThing.getSize(), MovingThing.getSize());
			}

			if (selectedSquare != null) {
				g.setColor(Color.BLACK);
				g.drawRect(selectedSquare.getX() * width + 10, selectedSquare.getY() * width + 10, width, width);
			}

			int baseWidth = 30;
			g.setColor(Color.GREEN);
			g.fillRect(500 + 10 - baseWidth / 2, 350 + 10 - baseWidth / 2, baseWidth, baseWidth);

			if (model.isGameOver()) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Helvetica", 100, 100));
				g.drawString("Game over!", 100, 100);
				g.drawString("R to restart", 100, 200);

			}
		}
	}

	private JFrame getFrame() {
		return this;
	}

	private class ControlPanel extends JPanel {

		private JLabel moneyLabel;
		private JLabel scoreLabel;
		private JLabel baseLabel;
		private JLabel purchaseErrorLabel;

		public ControlPanel() {
			this.setLayout(new GridLayout(3, 1));

			JPanel moneyPanel = new JPanel();
			moneyPanel.setLayout(new GridLayout(3, 1));
			moneyLabel = new JLabel("Money");
			moneyPanel.add(moneyLabel);
			purchaseErrorLabel = new JLabel("");
			purchaseErrorLabel.setForeground(Color.RED);
			moneyPanel.add(purchaseErrorLabel);
			this.add(moneyPanel);

			baseLabel = new JLabel("Base Health");
			this.add(baseLabel);
		}

		public void paintComponent(Graphics g) {
			if (model == null)
				return;

			moneyLabel.setText("money: " + model.getMoney());
			if (model.getBackground() != null && model.getBackground().getHome() != null)
				baseLabel.setText("Health: " + model.getBackground().getHome().getHealth());
		}

		public void setPurchaseErrorMessage(String message) {
			purchaseErrorLabel.setText(message);
		}
	}

}
