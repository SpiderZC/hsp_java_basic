package tankgame2;

import javax.swing.*;
import java.awt.*;

public class TankGame02 extends JFrame {

    GamePanel gamePanel = null;

    public TankGame02() throws HeadlessException {
        gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setSize(1000, 750);
        // set listener
        this.setTitle("Tank Game");
        this.addKeyListener(gamePanel);
        this.setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        TankGame02 tankGame = new TankGame02();
    }
}
