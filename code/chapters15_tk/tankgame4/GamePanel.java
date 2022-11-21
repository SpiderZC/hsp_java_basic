package tankgame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class GamePanel extends JPanel implements KeyListener, Runnable {
    HeroTank hero = null;

    Vector<EnemyTank> enemys = new Vector<>();

    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    // define bombs show

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public GamePanel() {
        hero = new HeroTank(220, 300);
        hero.setSpeed(10);

        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 100);
            enemyTank.setDirect(2);

            // enemy move
            Thread thread = new Thread(enemyTank);
            thread.start();

            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());

            enemyTank.shots.add(shot);

            // run shot

            new Thread(shot).start();
            enemys.add(enemyTank);
        }
//        image1 = Toolkit.getDefaultToolkit().getImage("");
//        image2 = Toolkit.getDefaultToolkit().getImage("");
//        image2 = Toolkit.getDefaultToolkit().getImage("");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, getBounds().width, getBounds().height);

        if (hero != null && hero.getAlive()) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }
//        if (hero.shot != null && hero.shot.isAlive) {
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//        }

        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isAlive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);
            } else {
                hero.shots.remove(shot);
            }
        }

        // TODO add bombs

        for (EnemyTank enemyTank : enemys) {
            if (enemyTank.getAlive()) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int i = 0; i < enemyTank.shots.size(); i++) {
                    Shot shot = enemyTank.shots.get(i);
                    if (shot.isAlive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }


    // tank paint

    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        switch (type) {
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        // direct (0: up; 1: right; 2 down; 3 left)
        switch (direct) {
            case 0: // up
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                // TODO
        }
    }

    public void hitHero() {
        for (int i = 0; i < enemys.size(); i++) {
            EnemyTank enemyTank = enemys.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (hero.getAlive() && shot.isAlive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    public void hitTank(Shot shot, Tank tank) {
        // judge s shotting tank
        switch (tank.getDirect()) {
            case 0:
            case 2:
                if (shot.x > tank.getX() && shot.x < tank.getX() + 40 & shot.y > tank.getY() && shot.y < tank.getY() + 60) {
                    shot.isAlive = false;
                    tank.setAlive(false);
                    enemys.remove(tank);
                    // TODO add bomb
                }
                break;
            case 1:
            case 3:
                if (shot.x > tank.getX() && shot.x < tank.getX() + 60 && shot.y > tank.getY() && shot.y < tank.getY() + 40) {
                    shot.isAlive = false;
                    tank.setAlive(false);
                    enemys.remove(tank);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // direct (0: up; 1: right; 2 down; 3 left)
        if (e.getKeyCode() == KeyEvent.VK_K) {
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_L) {
            hero.setDirect(1);
            if (hero.getX() + 60 < getBounds().width) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.setDirect(2);
            if (hero.getY() + 60 < getBounds().height) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_H) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        // a == attack;
        if (e.getKeyCode() == KeyEvent.VK_A) {
//            if (hero.shot == null || !hero.shot.isAlive) {
            hero.shotEnemyTank();
//            }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // judge shot enemy
            if (hero.shot != null && hero.shot.isAlive) {
                for (int i = 0; i < enemys.size(); i++) {
                    EnemyTank enemy = enemys.get(i);
                    for (int j = 0; j < hero.shots.size(); j++) {
                        Shot shot = hero.shots.get(j);
                        if (shot.isAlive) {
                            hitTank(shot, enemy);
                        }
                    }
                }
            }

            // judge shot hero
            hitHero();

            this.repaint();
        }
    }
}
