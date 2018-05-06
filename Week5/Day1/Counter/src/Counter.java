public class Counter {

    int counter = 0;

    public Counter(int number) {
        this.counter = number;
    }

    public int add(int number){

        this.counter+=number;
        return counter;
    }

    public int add(){

        this.counter++;
        return counter;
    }

    public int reset(){

        this.counter=0;
        return counter;
    }


}
