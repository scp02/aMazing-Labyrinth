package view;

import controller.LabyrinthController;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private JLabel[][] treasureCards = new JLabel[4][6]; // 4 players and up to 6 cards each

    private JLabel[] playerNames = new JLabel[4];
    private JLabel[] playersScores = new JLabel[4];

    public PlayerPanel() {
        setLayout(null);
        setBounds(1050, 50, 700, 550);
     }

    public void setupPlayerNamesGUI() {
        // create empty labels for each player card, up to 6 each, and add to
        // PlayerPanel
        for (int currPlayer = 0; currPlayer < 4; currPlayer++) {
            for (int currCard = 0; currCard < 6; currCard++) {
                treasureCards[currPlayer][currCard] = new JLabel();
                treasureCards[currPlayer][currCard].setBounds(100 + 100 * currCard, 132 * currPlayer, 96, 132);
                add(treasureCards[currPlayer][currCard]);
            }

        }

        // add playerNames to the playerPanel
        for (int currPlayer = 0; currPlayer < playerNames.length; currPlayer++) {
            playerNames[currPlayer] = new JLabel(String.format("Player %s:", currPlayer + 1));
            playerNames[currPlayer].setBounds(25, 50 + 132 * currPlayer, 74, 20);
            playerNames[currPlayer].setForeground(Color.BLACK);
            if (currPlayer == LabyrinthController.board.getPlayerTurn()) {
                playerNames[currPlayer].setOpaque(true);
                playerNames[currPlayer].setBackground(Color.pink);
                playerNames[currPlayer].setForeground(Color.white);
            }
            add(playerNames[currPlayer]);

            // create players, their scores, and add to the PlayerPanel
            playersScores[currPlayer] = new JLabel(
                    "Score: " + LabyrinthController.board.getPlayers()[currPlayer].getScore());
            playersScores[currPlayer].setBounds(25, 50 + 20 + 132 * currPlayer, 96, 20);

            add(playersScores[currPlayer]);
        }

        // set respective player colors
        playerNames[0].setForeground(Color.red);
        playerNames[1].setForeground(Color.blue);
        playerNames[2].setForeground(Color.green);
        playerNames[3].setForeground(Color.yellow);

    }

    public JLabel[][] getTreasureCards() {
        return treasureCards;
    }

    public void setTreasureCards(JLabel[][] treasureCards) {
        this.treasureCards = treasureCards;
    }

    public void setTreasureCardsByPlayer(int player, int card, JLabel treasureCards) {
        this.treasureCards[player][card] = treasureCards;
    }

    public JLabel[] getPlayerNames() {
        return playerNames;
    }

    public void setPlayerNames(JLabel[] playerNames) {
        this.playerNames = playerNames;
    }

    public JLabel[] getPlayersScores() {
        return playersScores;
    }

    public void setPlayersScores(JLabel[] playersScores) {
        this.playersScores = playersScores;
    }
}


