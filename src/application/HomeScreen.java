package application;

import controller.LabyrinthController;

import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JFrame {
    // sets up the homescreen frame and displays it
    public HomeScreen() {

        setLayout(null);
        setTitle("LabyrinthApp");

        JLabel logo = new JLabel(new ImageIcon(
                new ImageIcon("images/logo.png").getImage().getScaledInstance(1458, 328, java.awt.Image.SCALE_SMOOTH)));

        logo.setBounds(10, 10, 1458, 328);
        JButton startGame = new JButton();
        startGame.setText("START GAME");
        startGame.setBounds(10, 348, 1458, 100);
        startGame.setFont(new Font("Low Batt Font", Font.BOLD, 31));
        startGame.setBorderPainted(false);

        startGame.setOpaque(true);
        startGame.setForeground(Color.white);
        startGame.setBackground(new Color(0, 91, 119));

        getContentPane().setBackground(new Color(250, 152, 58));

        startGame.addMouseListener(new java.awt.event.MouseAdapter() {
                                       public void mouseEntered(java.awt.event.MouseEvent evt) {
                                           startGame.setBackground(new Color(0, 62, 80));
                                       }
                                       public void mouseExited(java.awt.event.MouseEvent evt) {
                                           startGame.setBackground(new Color(0, 91, 119));
                                       }
                                   });

        startGame.addActionListener(event -> startGameMethod());

        add(startGame);
        add(logo);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1478, 480);
        setLocationRelativeTo(this);

        setVisible(true);

    }

    public HomeScreen (boolean startFromLoad) {
        startGameMethod();
    }

    // takes user to board
    public void startGameMethod() {
        // startGame.setText("LOADING");
        new LabyrinthController();
        dispose();

    }
}