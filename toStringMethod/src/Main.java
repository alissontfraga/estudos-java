public class Main {
    public static void main(String[] args) {
        //    .toString() = Method inherited from the Object class.
//                  Used to return a string representation of an object.
//                  By default, it returns a hash code as a unique identifier.
//                  It can be overriden to provide meaningful details.

        Car car1 = new Car("Toyota", "AE86", 2000, "White");
        Car car2 = new Car("Mazda", "Rx7 FC3S", 2002, "Yellow");

        System.out.println(car1);
        System.out.println(car2);

    }









}
