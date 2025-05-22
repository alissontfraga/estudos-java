public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("RX-7", "White");
        Car car2 = new Car("Ae86", "Black");
        Car car3 = new Car("R32", "Red");

        Car[] cars = {car1, car2, car3};


        for (Car car : cars){
            car.color = "black";
        }
        for (Car car : cars) {
            car.drive();
        }


    }
}
