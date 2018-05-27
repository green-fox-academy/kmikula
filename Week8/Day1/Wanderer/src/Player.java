import java.awt.*;

public class Player {

    int coordPointX;
    int coordPointY;
    int healthPoint;
    int defensePoint;
    int strikePoint;


    Map map = new Map();


    public Player() {
        // this.coordPointX = x;
        //  this.coordPointY = y;
        this.healthPoint = 20 + 3 * (int) (Math.random() * 6) + 0;
        this.defensePoint = 2 * (int) (Math.random() * 6) + 1;
        this.strikePoint = 5 + (int) (Math.random() * 6) + 1;
    }

    public int getCoordPointX() {
        return coordPointX;
    }

    public int getCoordPointY() {
        return coordPointY;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void draw(Graphics graphics) {
    }

    public void move(int nextX, int nextY) {
        this.coordPointX = nextX;
        this.coordPointY = nextY;
    }


  /*  public int generateRandomCoord(){
        return ((int) (Math.random() * 10) + 0);
    }   */

}


