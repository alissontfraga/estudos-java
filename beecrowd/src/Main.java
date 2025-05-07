import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int codigo1;
       int quantidade1;
       double preco1;
       int codigo2;
       int quantidade2;
       double preco2;
       double total;


       codigo1 = scanner.nextInt();
       quantidade1 = scanner.nextInt();
       preco1 = scanner.nextDouble();

       codigo2 = scanner.nextInt();
       quantidade2 = scanner.nextInt();
       preco2 = scanner.nextDouble();

       total = (quantidade1 * preco1) + (quantidade2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        scanner.close();
    }
}
