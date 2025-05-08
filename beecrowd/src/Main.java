import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int maiorAB;
        int maior;

       a = scanner.nextInt();
       b = scanner.nextInt();
       c = scanner.nextInt();

       maiorAB = (a + b + Math.abs(a - b)) / 2;
       maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

        scanner.close();
    }
}
