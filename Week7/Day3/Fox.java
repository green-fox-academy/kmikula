import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fox {
    String name;
    String type;
    String color;
    ArrayList<Fox> foxes;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
        //  this.foxes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }


    public static void main(String[] args) {

        ArrayList<Fox> foxes = new ArrayList<>();
        Fox fox1 = new Fox("Rudy", "pallida", "green");
        Fox fox2 = new Fox("Connor", "vulpes", "red");
        Fox fox3 = new Fox("Brad", "marble", "white");
        Fox fox4 = new Fox("Lizzy", "silver", "silver");
        Fox fox5 = new Fox("Shelley", "arctic", "green");

        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

        foxes.stream()
                .filter((Fox fox) -> fox.color.equals("green"))
                .map(Fox::getName)
                .forEach(System.out::println);


        System.out.println(foxes.stream()
                .collect(Collectors.groupingBy((Fox fox) -> fox.color.equals("green"),
                        Collectors.mapping(fox -> fox.getName(), Collectors.toList()))));


        foxes.stream()
                .filter((Fox fox) -> fox.color.equals("green"))
                .filter((Fox fox) -> fox.type.equals("pallida"))
                .map(Fox::getName)
                .forEach(System.out::println);

    }
}


//  Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
// it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!