package Calculadora;

public class Calculadora {
    double valor1;
    double valor2;

    public Calculadora() {
        this.valor1 = 0;
        this.valor2 = 0;
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double Somar() {
        return valor1 + valor2;
    }

    public double Somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Subtrair() {
        return valor1 - valor2;
    }

    public double Subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double Multiplicar() {
        return valor1 * valor2;
    }

    public double Multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double Dividir() {
        return (valor2 != 0) ? valor1/valor2 : 0.0;
    }

    public double Dividir(double valor1, double valor2) {
        return (valor2 != 0) ? valor1/valor2 : 0.0;
    }
}
