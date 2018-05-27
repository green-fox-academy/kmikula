import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {


    int level = 1;
    public static final int tilePx = 72;
    public static int nextX;
    public static int nextY;
    Map map;
    Hero hero = new Hero();


    Skeleton skeleton = new Skeleton(level);
    Skeleton skeleton2 = new Skeleton(level);
    Skeleton skeleton3 = new Skeleton(level);

    Boss boss = new Boss(1);

    public Board() {
        map = new Map();


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < map.map.size(); i++) {
            for (int j = 0; j < map.map.get(i).size(); j++) {
                if (map.map.get(i).get(j) == '0') {
                    indexX = i * tilePx;
                    indexY = j * tilePx;
                    graphics.fillRect(indexX, indexY, tilePx, tilePx);
                    PositionedImage image = new PositionedImage("wall.png", indexX, indexY);
                    image.draw(graphics);
                } else if (map.map.get(i).get(j) == '1') {
                    indexX = i * tilePx;
                    indexY = j * tilePx;
                    graphics.fillRect(indexX, indexY, tilePx, tilePx);
                    PositionedImage image = new PositionedImage("floor.gif", indexX, indexY);
                    image.draw(graphics);
                }
            }
        }

        hero.heroImage.draw(graphics);

        skeleton.skeletonImage.draw(graphics);
        skeleton2.skeletonImage.draw(graphics);
        skeleton3.skeletonImage.draw(graphics);

        boss.bossImage.draw(graphics);

    }


    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {


        // When the up or down keys hit, we change the position of our box


        String direction = "";

        System.out.println("before " + nextX + " " + nextY);
        int tempX = nextX;
        int tempY = nextY;
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (nextY >= tilePx) {
                nextY -= tilePx;
            } else {
                nextY = 0;
            }
            direction = "up";
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (nextY <= 648) {
                nextY += tilePx;
            } else {
                nextY = 648;
            }

            direction = "down";
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (nextX >= tilePx) {
                nextX -= tilePx;
            } else {
                nextX = 0;
            }

            direction = "left";
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (nextX <= 648) {
                nextX += tilePx;
            } else {
                nextX = 648;
            }

            direction = "right";
        }

        System.out.println("before2 " + nextX + " " + nextY);

        if (map.isNotBoundary(nextX, nextY, direction)) {
            if (map.isNotWall(nextX, nextY)) {
                hero.move(nextX, nextY, direction);
            } else if (direction.equals("up")) {
                nextX = tempX;
                nextY = tempY;
                hero.heroImage = new PositionedImage("src/hero-up.png", nextX, nextY);
            } else if (direction.equals("down")) {
                nextX = tempX;
                nextY = tempY;
                hero.heroImage = new PositionedImage("src/hero-down.png", nextX, nextY);
            } else if (direction.equals("left")) {
                nextX = tempX;
                nextY = tempY;
                hero.heroImage = new PositionedImage("src/hero-left.png", nextX, nextY);
            } else if (direction.equals("right")) {
                nextX = tempX;
                nextY = tempY;
                hero.heroImage = new PositionedImage("src/hero-right.png", nextX, nextY);
            }
        }

        System.out.println("after " + nextX + " " + nextY);

        // and redraw to have a new picture with the new coordinates
        repaint();
    }

}