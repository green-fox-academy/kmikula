import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {


        Fleet fleet = new Fleet();
        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove obstacles");
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat lunch");

        thing3.complete();
        thing4.complete();

        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);


        Collections.sort(fleet.getThings());

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}
