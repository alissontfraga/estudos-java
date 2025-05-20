import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horasGastas = scanner.nextInt();
        int velocidade = scanner.nextInt();
        double litros = 12;
        double dp;
        double total;

        dp = velocidade * horasGastas;
        total = dp / litros;
        System.out.printf("%.3f\n", total);

        scanner.close();
    }
}
