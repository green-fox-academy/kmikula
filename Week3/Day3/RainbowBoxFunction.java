import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int width = 320;
        int height = 343;


        while (width > 0 && height > 0) {
            width *= 0.9;
            height *= 0.9;


            int x = 320 / 2 - (int) width / 2;
            int y = (int) (343 / 2) - (int) height / 2;

            int r = (int) (Math.random() * 200);
            int g = (int) (Math.random() * 200);
            int b = (int) (Math.random() * 200);
            Color color = new Color(r, g, b);

            graphics.setColor(color);
            graphics.fillRect(x, y, width, height);
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
