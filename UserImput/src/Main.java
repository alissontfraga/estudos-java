import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter your name: ");  //.print pra pegar o input na mesma linha
        String name = scanner.nextLine();  //declaration // assignment //.next nao pega espaços

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  //para inteiros

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();  //para decimais

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        //System.out.println("Student: " + isStudent);
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are not enrolled");
        }

        //Problema:
        //Após o uso de nextInt() ou nextDouble(), quando você tenta ler
        // uma String com nextLine(), o nextLine() pode ler um valor vazio
        // ou acabar lendo o caractere de nova linha restante no buffer de
        // entrada. Isso acontece porque nextInt() e nextDouble() não
        // consomem o caractere de nova linha \n.
        //
        //Solução:
        //A solução é adicionar uma chamada extra de nextLine() após
        // a leitura de um número para consumir o caractere de nova linha
        // que sobra no buffer
        //

        scanner.close();
    }
}
