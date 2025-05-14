import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        //display welcome message
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols:🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");


        //play if balance > 0
        while(balance > 0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance){
                System.out.println("Insufficient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            }
            else{
                balance -= bet;
                System.out.println("$" + balance);
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            getPayout(row, bet);
        }



        //enter bet amount


        //verify if bet > balance


        //verify if bet > 0


        //subtract bet from balance


        //spin row


        //print row


        //get payout


        //ask to play again

        //display exit message




        scanner.close();

    }
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔","⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");

    }
    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1])) && (row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;

            }
        }


    }


}
