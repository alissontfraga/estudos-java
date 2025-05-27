public class Main {
    public static void main(String[] args) {

//        abstract = used to define abstract classes and methods.
//                Abstraction is the process of hiding implementation
//                details and showing only the essential features.
//                Abstract classes CAN`T be instantiated directly
//                Can contain 'abstract' methods (which must be implemented)
//                Can contain 'concrete' methods (which are inherited)

       circle circle = new circle(3);
       triangle triangle = new triangle(4, 5);
       rectangle rectangle = new rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());




    }
}
