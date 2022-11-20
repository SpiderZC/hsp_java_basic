package draw;

import java.awt.*;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 800);
        g.setColor(Color.CYAN);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/z.jpeg"));
//        g.drawImage(image, 100, 100, 175, 175, this);
        g.drawOval(10, 10, 200, 200);
    }

}
