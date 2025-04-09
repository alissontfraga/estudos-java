import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //.substring() = a method to extract a portion of  a
        //string.   .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +1);

            System.out.println(username);
            System.out.println(domain);

        }
        else {
            System.out.println("Email must contain @a");
        }


        //String email = "alisso@gmail.com";
        //String username = email.substring(0, 6);
        //String domain = email.substring(7,16); //ou apenas (7) e ele contava o resto automaticamente

        //String username = email.substring(0, email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@") +1); //pra pegar depois do @
        //System.out.println(username);
        //System.out.println(domain);


        scanner.close();



    }
}
