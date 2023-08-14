package ImparOuPar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int numero = scanner.nextInt();

        Calculo calculo = new Calculo(numero);
    }
}
