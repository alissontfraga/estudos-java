import java.util.Random;

public class Main {
    public static void main(String[] args){

    Random random = new Random();

    //int number;

    //number = random.nextInt(1, 6); //nao chega no 6

    //System.out.println(number);



     /*   int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    */

      //double number;

      //number = random.nextDouble(1, 5);

      //System.out.println(number);


       //flippin a coin
      boolean isHeads;

      isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }






    }
}
