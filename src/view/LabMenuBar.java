package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabMenuBar extends JMenuBar implements ActionListener {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu setup = new JMenu("Setup");
    private JMenuItem[] cardNum = new JMenuItem[6];
    private JButton help = new JButton("Help");

    private JButton loadGame = new JButton("Load Game");
    private JButton saveGame = new JButton("Save Game");

    // sets up the GUI for the menu bar
    public LabMenuBar() {
        cardNum[0] = new JMenuItem("1 Card");
        cardNum[1] = new JMenuItem("2 Cards");
        cardNum[2] = new JMenuItem("3 Cards");
        cardNum[3] = new JMenuItem("4 Cards");
        cardNum[4] = new JMenuItem("5 Cards");
        cardNum[5] = new JMenuItem("6 Cards");

        help.setOpaque(false);
        help.setContentAreaFilled(false);
        help.setBorderPainted(false);

        loadGame.setOpaque(false);
        loadGame.setContentAreaFilled(false);
        loadGame.setBorderPainted(false);

        saveGame.setOpaque(false);
        saveGame.setContentAreaFilled(false);
        saveGame.setBorderPainted(false);
    }

    public JButton getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(JButton saveGame) {
        this.saveGame = saveGame;
    }

    public JButton getLoadGame() {
        return loadGame;
    }

    public void setLoadGame(JButton loadGame) {
        this.loadGame = loadGame;
    }

    public JButton getHelp() {
        return help;
    }

    public void setHelp(JButton help) {
        this.help = help;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public JMenu getSetup() {
        return setup;
    }

    public void setSetup(JMenu setup) {
        this.setup = setup;
    }

    public JMenuItem[] getCardNum() {
        return cardNum;
    }

    public void setCardNum(JMenuItem[] cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() instanceof JMenuItem) {
            JMenuItem menuEvent = (JMenuItem) event.getSource();
            String s = String.valueOf(menuEvent.getText().toCharArray()[0]);
        }
    }
}
