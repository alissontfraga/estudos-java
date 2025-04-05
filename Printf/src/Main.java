

public class Main {
    public static void main(String[] args) {

        //printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

       /* String name = "Raiden";
        char firstLetter = 'R';
        int age = 25;
        double height = 1.80;
        boolean isSworded = true;

        System.out.printf("Hello %s\n", name); //string
        System.out.printf("Your name starts with a %c\n", firstLetter); //char
        System.out.printf("You are %d years old\n", age); //int
        System.out.printf("You are %f inches tall\n", height); //double
        System.out.printf("Do you have a sword?: %b\n", isSworded); //boolean

        System.out.printf("%s is %d years old", name, age);
        */


        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

     /*   System.out.printf("%.3f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

      */


        // * = output a plus
        // , = comma grouping separator  EX: R$1,000,00
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if is positive - tipo uma indentação

     /*   System.out.printf("% .3f\n", price1);
        System.out.printf("% ,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

      */


        //[width]

        //0 = zero padding
        //number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);










    }
}
