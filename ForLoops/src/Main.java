import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //for loop = execute some code a CERTAIN amount of times


        /* for (int i = 0; i <= 10; i++){  //for (contador; termino; quanto vai aumentar);
            System.out.println(i);
        } */


        /* for (int i = 1; i <= 10; i+=3){
            System.out.println(i);
        } */

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for (int i= 1; i <= max; i++){
//            System.out.println(i);
//
//
//        }

        System.out.print("How many seconds  to countdown from?: ");
        int start = scanner.nextInt();
        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy new year!");




        scanner.close();




    }
}
