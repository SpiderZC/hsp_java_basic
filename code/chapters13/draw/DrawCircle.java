package draw;

import javax.swing.JFrame;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 800);
        // set btn close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set Visible
        this.setVisible(true);
    }
}
