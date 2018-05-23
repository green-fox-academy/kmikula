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
    ArrayList<String> mapTemplate;
    int[][] map = drawMap();


    PositionedImage hero = new PositionedImage("hero-down.png", 0, 0);
//    PositionedImage hero2 = new PositionedImage("hero-up.png", 0, 0);
//    PositionedImage hero3 = new PositionedImage("hero-left.png", 0, 0);
//    PositionedImage hero4 = new PositionedImage("hero-right.png", 0, 0);

    public Board() {

        testBoxX = 0;
        testBoxY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    public int[][] drawMap() {
        int[][] coord = new int[10][10];
        level = "level0.txt";
        int index2 = 0;

        Path filepath = Paths.get(level);

        try {
            mapTemplate = new ArrayList<>(Files.readAllLines(filepath));
        } catch (IOException e) {
            System.out.println("Cannot find file for level.");
        }


        for (int i = 0; i < mapTemplate.size(); i++) {
            index2 = 0;
            for (int j = 0; j < 20; j += 2) {
                coord[index2][i] = mapTemplate.get(i).charAt(j);

                index2++;
            }

        }
        return coord;
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == 48) {
                    indexX = i * 72;
                    indexY = j * 72;
                    graphics.fillRect(indexX, indexY, 72, 72);
                    PositionedImage image = new PositionedImage("wall.png", indexX, indexY);
                    image.draw(graphics);
                } else if (map[i][j] == 49) {
                    indexX = i * 72;
                    indexY = j * 72;
                    graphics.fillRect(indexX, indexY, 72, 72);
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
            if ( hero.posY >= 72) {
                hero.posY -= 72;

                hero = new PositionedImage("src/hero-up.png", hero.posX, hero.posY);
            }else{
                hero.posY+=0;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            if ( hero.posY < 648) {
                hero.posY += 72;
                hero = new PositionedImage("src/hero-down.png", hero.posX, hero.posY);
            }else{
                hero.posY += 0;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if ( hero.posX >= 72) {
                hero.posX -= 72;
                hero = new PositionedImage("src/hero-left.png", hero.posX, hero.posY);
            }else{
                hero.posX -= 0;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            if ( hero.posX < 648) {
                hero.posX += 72;
                hero = new PositionedImage("src/hero-right.png", hero.posX, hero.posY);
            }else{
                hero.posX += 0;
            }

        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}