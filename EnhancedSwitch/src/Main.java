import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It`s a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It`s the weekend");

            default -> System.out.println(day + " is not a day");
        }




    }
}
