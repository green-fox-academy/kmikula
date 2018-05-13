public class Main {
    public static void main(String[] args) {

        Vehicle helicopter = new Helicopter("Bell 206");

        Animal bird = new Bird("Toucan");

        System.out.println(bird.name+" takes off "+ ((Bird) bird).takeOff()+", flies "+((Bird) bird).fly()+", lands "+((Bird) bird).land());

        System.out.println(helicopter.toString());

        System.out.println(helicopter.type+" is a "+helicopter.getClass().getSimpleName()+" takes off "+((Helicopter) helicopter).takeOff()+", flies "+((Helicopter) helicopter).fly()+", lands "+((Helicopter) helicopter).land());
    }
}
