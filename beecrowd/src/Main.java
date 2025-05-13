import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      int X = scanner.nextInt();
      double Y = scanner.nextDouble();
      double consumo = X / Y;

        System.out.printf("%.3f km/l\n", consumo);

        scanner.close();
    }
}
