import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String[] foods = new String[4]; //array vazio, que tem espaço para 3 elementos
        String[] foods;
        int size;

        System.out.print("What Num of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];


        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();

        }





        for (String food : foods){
            System.out.println(food);
        }




        scanner.close();
    }
}
