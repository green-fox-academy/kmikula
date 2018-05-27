import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Map {

    String level;
    ArrayList<String> mapTemplate;
    ArrayList<ArrayList<Character>> map;


    public Map() {
        this.map = drawMap();
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

    public boolean isNotWall(int nextX, int nextY) {

        return map.get(nextX / Board.tilePx).get(nextY / Board.tilePx) == '1';
    }

    public boolean isNotBoundary(int nextX, int nextY, String direction) {
        if (direction.equals("up") && nextY >= 0) {
            return true;
        } else if (direction.equals("down") && nextY <= 720 - Board.tilePx) {
            return true;
        } else if (direction.equals("left") && nextX >= 0) {
            return true;
        } else if (direction.equals("right") && nextX <= 720 - Board.tilePx) {
            return true;
        } else {
            return false;
        }
    }

    public int generateRandomCoord() {
        return ((int) (Math.random() * 10) + 0) * Board.tilePx;
    }

    public int avoidWall(int coordX) {
        int tempCoordPointY = generateRandomCoord();
        while (!isNotWall(coordX, tempCoordPointY)) {
            tempCoordPointY = generateRandomCoord();
        }
        return tempCoordPointY;
    }

}
