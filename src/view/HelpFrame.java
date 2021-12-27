package view;

import javax.swing.*;

public class HelpFrame extends JFrame {

    // constructor
    // generates the help menu screen
    public HelpFrame() {
        setTitle("Instructions");
        JPanel rules = new JPanel();

        JLabel rule1 = new JLabel(new ImageIcon(new ImageIcon("images/Rules1.jpg").getImage().getScaledInstance(700,
                850, java.awt.Image.SCALE_SMOOTH)));
        JLabel rule2 = new JLabel(new ImageIcon(new ImageIcon("images/Rules2.jpg").getImage().getScaledInstance(700,
                850, java.awt.Image.SCALE_SMOOTH)));
        rule1.setBounds(0, 10, 500, 600);
        rule2.setBounds(0, 610, 500, 600);
        rules.add(rule1);
        rules.add(rule2);
        rules.setLayout(new BoxLayout(rules, BoxLayout.Y_AXIS));
        add(new JScrollPane(rules));

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 840);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }

}

