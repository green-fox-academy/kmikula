import java.awt.*;

public class Skeleton extends Player {

    PositionedImage skeletonImage;


    int coordPointX = map.generateRandomCoord();
    int coordPointY = map.avoidWall(coordPointX);


    public Skeleton(int level) {
        this.healthPoint = 2 * level * (int) (Math.random() * 6) + 1;
        this.defensePoint = level / 2 * (int) (Math.random() * 6) + 1;
        this.strikePoint = level * (int) (Math.random() * 6) + 1;
        this.skeletonImage = new PositionedImage("src/skeleton.png", coordPointX, coordPointY);
    }

    public void draw(Graphics graphics) {
    }


}
