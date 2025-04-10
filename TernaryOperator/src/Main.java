public class Main {
    public static void main(String[] args) {
        //ternary operator ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse;

        int score = 75;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);


        int number = 4;

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfDay);


        int income = 30000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
