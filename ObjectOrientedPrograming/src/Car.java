public class Car {

    //Attributes

    String make = "Mazda";
    String model = "Rx-7 FC3S";
    int year = 2000;
    double price = 58000.99;
    boolean isRunning = false;

    //method
    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }
}
