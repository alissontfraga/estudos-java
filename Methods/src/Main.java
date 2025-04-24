public class Main {
    public static void main(String[] args) {
        //method = a block of reusable code that is executed when called ()

        String name = "Alisso";
        int age = 19;   //methods not familiar with variables by default
        // we can add between the ()

        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);
        double result2 = cube(3);
        System.out.println(result2);
        String fullName = getFullName("ALisso", "Liz");
        System.out.println(fullName);

        if (ageCheck(age)){
            System.out.println("You can acess!");
        }
        else{
            System.out.println("You must been 18+ years old!");
        }

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

}

