import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //array = a collection of values of the same data type
        // think of it as a variable that can store more than 1 value
        //reference datatype
        //os objetos sao um elemento, precisa do indíce

        String[] fruits = {"apple", "orange", "banana", "mango"};

  //      fruits[0] = "pineapple";
  //      System.out.println(fruits[0]);

  //      int numOfFruits = fruits.length;
  //      System.out.println(numOfFruits);

//        for (int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " "); //mesma linha
//            System.out.println(fruits[i]); // separados
//
//        }

        for (String fruit : fruits){
            System.out.println(fruit);   //imprime o array igual o anterior,
                                            // mas o código é mais simples
        }

        //sort arrays alphabeticly
        //Arrays.sort(fruits);

        //encher o array de "algo"
        Arrays.fill(fruits, "pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        scanner.close();
    }
}
