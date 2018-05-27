import java.awt.*;

public class Hero extends Player {

    public static PositionedImage heroImage;

    public Hero() {
        super();
        int coordPointX = Board.nextX;
        int coordPointY = Board.nextY;
        heroImage = new PositionedImage("src/hero-down.png", coordPointX, coordPointY);
    }

    //@Override
    public void move(int nextX, int nextY, String direction) {
        super.move(nextX, nextY);
        if (direction.equals("up")) {
            heroImage = new PositionedImage("src/hero-up.png", nextX, nextY);
        } else if (direction.equals("down")) {
            heroImage = new PositionedImage("src/hero-down.png", nextX, nextY);
        } else if (direction.equals("left")) {
            heroImage = new PositionedImage("src/hero-left.png", nextX, nextY);
        } else if (direction.equals("right")) {
            heroImage = new PositionedImage("src/hero-right.png", nextX, nextY);
        }

    }


    public void draw(Graphics graphics) {
    }
}
