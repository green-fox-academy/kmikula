import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {

    static ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));


    public static void main(String []args){


        System.out.println(putSaturn(planetList));



    }

    private static ArrayList putSaturn(ArrayList<String> planetList) {

        int neptunPlace = SolarSystem.planetList.indexOf("Neptune");
        SolarSystem.planetList.add(neptunPlace+1,"Saturn");

        return planetList;
    }
}


// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"