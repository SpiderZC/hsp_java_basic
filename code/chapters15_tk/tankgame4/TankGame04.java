package tankgame4;

import javax.swing.*;
import java.awt.*;

public class TankGame04 extends JFrame {

    GamePanel gamePanel = null;

    public TankGame04(){
        gamePanel = new GamePanel();
        Thread thread = new Thread(gamePanel);
        thread.start();
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
        TankGame04 tankGame = new TankGame04();
    }
}
