import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String level;
    public static final int tilePx = 72;
    ArrayList<String> mapTemplate;

    ArrayList<ArrayList<Character>> map = drawMap();


    PositionedImage hero = new PositionedImage("hero-down.png", 0, 0);


    public Board() {

        testBoxX = 0;
        testBoxY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }


    public ArrayList<ArrayList<Character>> drawMap() {
        level = "level0.txt";

        Path filepath = Paths.get(level);

        try {
            mapTemplate = new ArrayList<>(Files.readAllLines(filepath));
        } catch (IOException e) {
            System.out.println("Cannot find file for level.");
        }


        ArrayList<ArrayList<Character>> coord = new ArrayList<>();
        ArrayList<Character> lineInChars;

        for (String line : mapTemplate) {
            lineInChars = new ArrayList<>();
            for (Character actChar : line.toCharArray()) {
                lineInChars.add(actChar);
            }
            coord.add(lineInChars);
        }
        return coord;
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.get(i).size(); j++) {
                if (map.get(i).get(j) == '0') {
                    indexX = i * tilePx;
                    indexY = j * tilePx;
                    graphics.fillRect(indexX, indexY, tilePx, tilePx);
                    PositionedImage image = new PositionedImage("wall.png", indexX, indexY);
                    image.draw(graphics);
                } else if (map.get(i).get(j) == '1') {
                    indexX = i * tilePx;
                    indexY = j * tilePx;
                    graphics.fillRect(indexX, indexY, tilePx, tilePx);
                    PositionedImage image = new PositionedImage("floor.gif", indexX, indexY);
                    image.draw(graphics);
                }
            }
        }
        hero.draw(graphics);

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

        if (e.getKeyCode() == KeyEvent.VK_UP) {

            if (hero.posY >= tilePx) {

                if ((map.get(hero.posX / tilePx).get((hero.posY - tilePx) / tilePx) == '0')) {
                    hero.posY += 0;
                    hero = new PositionedImage("src/hero-up.png", hero.posX, hero.posY);

                } else {
                    hero.posY -= tilePx;
                    hero = new PositionedImage("src/hero-up.png", hero.posX, hero.posY);

                }
            } else {
                hero.posY += 0;
                hero = new PositionedImage("src/hero-up.png", hero.posX, hero.posY);
            }

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            if (hero.posY < 720 - tilePx) {
                if ((map.get(hero.posX / tilePx).get((hero.posY + tilePx) / tilePx) == '0')) {
                    hero.posY += 0;
                    hero = new PositionedImage("src/hero-down.png", hero.posX, hero.posY);

                } else {
                    hero.posY += tilePx;
                    hero = new PositionedImage("src/hero-down.png", hero.posX, hero.posY);
                }
            } else {
                hero.posY += 0;
                hero = new PositionedImage("src/hero-down.png", hero.posX, hero.posY);
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if (hero.posX >= tilePx) {
                if ((map.get((hero.posX - tilePx) / tilePx).get(hero.posY / tilePx) == '0')) {
                    hero.posX += 0;
                    hero = new PositionedImage("src/hero-left.png", hero.posX, hero.posY);

                } else {
                    hero.posX -= tilePx;
                    hero = new PositionedImage("src/hero-left.png", hero.posX, hero.posY);
                }
            } else {
                hero.posX -= 0;
                hero = new PositionedImage("src/hero-left.png", hero.posX, hero.posY);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            if (hero.posX < 720 - tilePx) {
                if ((map.get((hero.posX + tilePx) / tilePx).get(hero.posY / tilePx) == '0')) {
                    hero.posY += 0;
                    hero = new PositionedImage("src/hero-right.png", hero.posX, hero.posY);

                } else {
                    hero.posX += tilePx;
                    hero = new PositionedImage("src/hero-right.png", hero.posX, hero.posY);
                }
            } else {
                hero.posX += 0;
                hero = new PositionedImage("src/hero-right.png", hero.posX, hero.posY);
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

}