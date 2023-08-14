package ImparOuPar;

public class Calculo {
    int numero;
    boolean isPrime;

    public Calculo(int numero) {
        this.numero = numero;
        this.isPrime = VerificarPrimo();
    }

    public boolean VerificarPrimo() {
        for (int i = 2; i < numero; i++) {
            if (numero%i == 0) {
                System.out.println("O número " + numero + " não é primo!");
                return false;
            }
        }
        System.out.println("O número " + numero + " é primo!");
        return true;
    }
}
