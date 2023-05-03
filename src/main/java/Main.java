public class Main {

    public static void main(String[] args) {

        AnimalSound lambdaPrint = (s) -> "meow" + s;

        printSound(lambdaPrint);

        // no object needed to call method
        // using own implementation
        // lambdas can only use one interface abstract method
        // very similar to functional interfaces
    }


    public static void printSound(AnimalSound thing){
        System.out.println(thing.printingSound("!"));
    }

}
