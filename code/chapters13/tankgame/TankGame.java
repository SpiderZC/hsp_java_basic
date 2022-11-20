package tankgame;

import javax.swing.*;
import java.awt.*;

public class TankGame extends JFrame {

    GamePanel gamePanel = null;

    public TankGame() throws HeadlessException {
        gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
}
