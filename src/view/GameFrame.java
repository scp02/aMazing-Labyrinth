package view;

import application.HomeScreen;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private BoardPanel boardPanel = new BoardPanel();
    private ControlPanel controlPanel = new ControlPanel();
    private FreeTilePanel freeTilePanel = new FreeTilePanel();
    private PlayerPanel playerPanel = new PlayerPanel();

    JButton showPathwaysButton = new JButton("Show pathways");

    // menu
    private LabMenuBar labMenuBar = new LabMenuBar();

    public GameFrame() {
        setLayout(null);

        add(freeTilePanel);
        add(controlPanel);
        add(boardPanel);
        add(playerPanel);

        add(labMenuBar);

        setSize(1770, 877);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public LabMenuBar getLabMenuBar() {
        return labMenuBar;
    }

    public void setLabMenuBar(LabMenuBar labMenuBar) {
        this.labMenuBar = labMenuBar;
    }

    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public void setBoardPanel(BoardPanel boardPanel) {
        this.boardPanel = boardPanel;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public FreeTilePanel getFreeTilePanel() {
        return freeTilePanel;
    }

    public void setFreeTilePanel(FreeTilePanel freeTilePanel) {
        this.freeTilePanel = freeTilePanel;
    }

    public PlayerPanel getPlayerPanel() {
        return playerPanel;
    }

    public void setPlayerPanel(PlayerPanel playerPanel) {
        this.playerPanel = playerPanel;
    }

    public JButton getShowPathwaysButton() {
        return showPathwaysButton;
    }

    public void setShowPathwaysButton(JButton showPathwaysButton) {
        this.showPathwaysButton = showPathwaysButton;
    }

    // displays a message when the game ends and returns to home screen
    public void endGame(int player) {
        JOptionPane.showMessageDialog(this, "Congrats to Player "+ (player + 1) +". Better luck next time everyone!");
        this.dispose();
        new HomeScreen();
    }

    // adds the pathway buttons to the frame
    public void setUpPathwaysButton() {
        showPathwaysButton.setOpaque(true);
        showPathwaysButton.setBounds(20,600,150,50);
        showPathwaysButton.setBackground(new Color(202, 103, 2));
        showPathwaysButton.setForeground(new Color(233, 216, 166));
        showPathwaysButton.setForeground(Color.black);
    }

}