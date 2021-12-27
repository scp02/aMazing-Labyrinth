package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardPanel extends JPanel {

    private JLabel[][] tileLabels = new JLabel[7][7];
    private JLabel[] playerTokens = new JLabel[4];
    private JButton[][] insertButtons = new JButton[4][3];
    private JLabel board = new JLabel(new ImageIcon("images/GameBoard.png"));
    private static final int BOARDX = 100;
    private static final int BOARDY = 55;
    private JLabel[][] playerLabels = new JLabel[7][7];

    private JLabel[][] pathwayLabels = new JLabel[7][7];


    public BoardPanel() {

        setLayout(null);
        board.setBounds(BOARDX, BOARDY, 672, 672);

        setBounds(180, 0, 850, 800);

        loadUpInsertButtons();
        loadUpPlayerLabels();
        loadUpPathwayLabels();

        addTiles();
        add(board);

    }

    // loads up all possible pathways and displays on the board
    private void loadUpPathwayLabels() {

        for (int row = 0; row < pathwayLabels.length; row++) {

            for (int col = 0; col < pathwayLabels[row].length; col++) {

                pathwayLabels[row][col] = new JLabel();
                pathwayLabels[row][col].setBounds(BOARDX + (96 * (col)), BOARDY + (96 * row), 96, 96);
                pathwayLabels[row][col].setBackground(new Color(202, 103, 2,150));
                pathwayLabels[row][col].setOpaque(true);
                pathwayLabels[row][col].setVisible(false);
                add(pathwayLabels[row][col]);
            }
        }
    }

    // loads up player tokens and displays on the board
    private void loadUpPlayerLabels() {
    	
    	for (int row = 0; row < playerLabels.length; row++) {

            for (int col = 0; col < playerLabels[row].length; col++) {

            	playerLabels[row][col] = new JLabel();
            	playerLabels[row][col].setBounds(BOARDX+30 + (96 * (col)), BOARDY+30 + (96 * row), 40, 40);
            	playerLabels[row][col].setBackground(Color.black);
            	playerLabels[row][col].setVisible(false);
                add(playerLabels[row][col]);
                
            }
        }
    	
    	playerLabels[0][0].setIcon(new ImageIcon(new ImageIcon(
                "images/red.png")
                .getImage()));
    	playerLabels[0][0].setVisible(true);
    	
    	playerLabels[0][6].setIcon(new ImageIcon(new ImageIcon(
                "images/blue.png")
                .getImage()));
    	playerLabels[0][6].setVisible(true);
    	
    	playerLabels[6][6].setIcon(new ImageIcon(new ImageIcon(
                "images/green.png")
                .getImage()));
    	playerLabels[6][6].setVisible(true);
    	
    	playerLabels[6][0].setIcon(new ImageIcon(new ImageIcon(
                "images/yellow.png")
                .getImage()));
    	playerLabels[6][0].setVisible(true);
    	
	}

    // generates the 12 free tile insert icons around the board.
	private void loadUpInsertButtons() {
        int vertical = 0;
        int tophorizontal = BOARDX + 130;
        int bottomhorizontal = BOARDX + 130;
        int leftDown = 175;
        int rightDown = 175;

        for (int side = 0; side < 4; side++) {
            for (int row = 0; row < 3; row++) {

                insertButtons[side][row] = new JButton();

                if (side == 0) {

                    insertButtons[side][row] = new JButton(new ImageIcon(new ImageIcon("images/InsertArrow2.png")
                            .getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH)));

                    insertButtons[side][row].setBounds(tophorizontal, vertical, 40, 40);
                    tophorizontal += 190;

                } else if (side == 1) {
                    int horizontal = 50;

                    insertButtons[side][row] = new JButton(new ImageIcon(new ImageIcon("images/InsertArrow1.png")
                            .getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH)));

                    insertButtons[side][row].setBounds(horizontal, leftDown, 40, 40);
                    leftDown += 200;
                }
                if (side == 2) {

                    insertButtons[side][row] = new JButton(new ImageIcon(new ImageIcon("images/InsertArrow0.png")
                            .getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH)));

                    insertButtons[side][row].setBounds(bottomhorizontal, vertical, 40, 40);
                    bottomhorizontal += 190;

                } else if (side == 3) {

                    int horizontal = 785;

                    insertButtons[side][row] = new JButton(new ImageIcon(new ImageIcon("images/InsertArrow3.png")
                            .getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH)));

                    insertButtons[side][row].setBounds(horizontal, rightDown, 40, 40);
                    rightDown += 200;
                }
                add(insertButtons[side][row]);

            }

            vertical += 370;

        }
    }

    // adds tile image icons to the board
    private void addTiles() {

        for (int row = 0; row < tileLabels.length; row++) {

            for (int col = 0; col < tileLabels[row].length; col++) {

                tileLabels[row][col] = new JLabel();
                tileLabels[row][col].setBounds(BOARDX + (96 * (col)), BOARDY + (96 * row), 96, 96);
                tileLabels[row][col].setBackground(new Color(7,55,99));
                add(tileLabels[row][col]);
            }
        }

    }

    public JLabel[][] getTileLabels() {
        return tileLabels;
    }

    public void setTileLabels(JLabel[][] tileLabels) {
        this.tileLabels = tileLabels;
    }

    public JLabel[] getPlayerTokens() {
        return playerTokens;
    }

    public void setPlayerTokens(JLabel[] playerTokens) {
        this.playerTokens = playerTokens;
    }

    public JButton[][] getInsertButtons() {
        return insertButtons;
    }

    public void setInsertButtons(JButton[][] insertButtons) {
        this.insertButtons = insertButtons;
    }

	public JLabel[][] getPlayerLabels() {
		return playerLabels;
	}

	public void setPlayerLabels(JLabel[][] playerLabels) {
		this.playerLabels = playerLabels;
	}

    public JLabel[][] getPathwayLabels() {
        return pathwayLabels;
    }

    public void setPathwayLabels(JLabel[][] pathwayLabels) {
        this.pathwayLabels = pathwayLabels;
    }
}



