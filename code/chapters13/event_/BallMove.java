package event_;

import javax.swing.*;

public class BallMove extends JFrame {
    MyPanel panel = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        panel = new MyPanel();
        this.add(panel);
        this.setSize(400, 300);
        // add listener
        this.addKeyListener(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
