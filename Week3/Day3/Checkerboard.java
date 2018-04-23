import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {


    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;

        for (int i = 0; i < 64; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 160; j+=20) {

                    for (int k = 0; k < 160; k += 20) {

                        y = j;
                        x = k;

                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(x, y, 10, 10);

                    }
                }
            } else {
                for (int j = 10; j < 160; j+=20) {

                    for (int k = 10; k < 160; k+=20) {

                        y = j;
                        x = k;
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(x, y, 10, 10);
                    }
                }


            }


        }


    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
