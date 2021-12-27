package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;

import controller.LabyrinthController;
import model.Tile;

import javax.imageio.ImageIO;

public class FreeTilePanel extends JPanel {
    BufferedImage myPicture;

    private JLabel freeTileLabel = new JLabel();

    private JButton rotateClock = new JButton();
    private JButton rotateAntiClock = new JButton();

    public FreeTilePanel() {
        setBounds(0, 50, 175, 200);
        setLayout(null);
    }

    // Sets up the free tile label in the top left corner. Also adds buttons near the free tile.
    public void setupFreeTile() {

        Tile freeTile = new Tile();

        try {
            freeTile = LabyrinthController.board.getFreeTile();
            myPicture = ImageIO.read(new File("images/" + freeTile.getFileName() + freeTile.getOrientation() + ".png"));
            System.out.println("images/" + freeTile.getFileName() + freeTile.getOrientation() + ".png");
            freeTileLabel = new JLabel(new ImageIcon(myPicture));
            freeTileLabel.setBounds(0, 0, 100, 100);
            freeTileLabel.setOpaque(false);

            add(freeTileLabel);
            repaint();
        } catch (IOException e) {

            e.printStackTrace();
        }

        rotateAntiClock = new JButton(new ImageIcon(new ImageIcon("images/CounterclockwiseArrow.png")
                .getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        rotateClock = new JButton(new ImageIcon(new ImageIcon("images/ClockwiseArrow.png")
                .getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));

        rotateAntiClock.setBounds(101, 0, 70, 70);
        rotateClock.setBounds(0, 101, 70, 70);
        rotateAntiClock.setVisible(true);
        rotateClock.setVisible(true);

        add(rotateAntiClock);
        add(rotateClock);
        repaint();
        setVisible(true);
    }

    public JLabel getFreeTile() {
        return freeTileLabel;
    }

    public void setFreeTile(JLabel freeTileLabel) {
        this.freeTileLabel = freeTileLabel;
    }

    // Receives string filename. Image icon needs to be set using the file name
    public void setFreeTile(String fileName) {
    }

    public JButton getRotateClock() {
        return rotateClock;
    }

    public void setRotateClock(JButton rotateClock) {
        this.rotateClock = rotateClock;
    }

    public JButton getRotateAntiClock() {
        return rotateAntiClock;
    }

    public void setRotateAntiClock(JButton rotateAntiClock) {
        this.rotateAntiClock = rotateAntiClock;
    }

}
