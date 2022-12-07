package tankgame5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame05 extends JFrame {

    GamePanel gamePanel = null;
    Scanner scanner = new Scanner(System.in);

    public TankGame05(){
        String key = scanner.next();
        gamePanel = new GamePanel(key);
        Thread thread = new Thread(gamePanel);
        thread.start();
        this.add(gamePanel);
        this.setSize(1300, 750);
        // set listener
        this.setTitle("Tank Game");
        this.addKeyListener(gamePanel);
        this.setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("是否继续上局游戏");
        TankGame05 tankGame = new TankGame05();
    }
}
