import java.awt.*;

public class Boss extends Player {

    PositionedImage bossImage;


    int coordPointX = map.generateRandomCoord();
    int coordPointY = map.avoidWall(coordPointX);

    public Boss(int level) {
        this.healthPoint = 2 * level * (int) (Math.random() * 6) + 1 + ((int) (Math.random() * 6) + 1);
        this.defensePoint = level / 2 * (int) (Math.random() * 6) + 1 + ((int) (Math.random() * 6) + 1) / 2;
        this.strikePoint = level * (int) (Math.random() * 6) + 1 + level;
        this.bossImage = new PositionedImage("src/boss.png", coordPointX, coordPointY);
    }

    public void draw(Graphics graphics) {
    }
}
