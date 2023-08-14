package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1,2);
        double soma = calculadora.Somar();
        double subtracao = calculadora.Subtrair();
        double produto = calculadora.Multiplicar();
        double divisao = calculadora.Dividir();
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(produto);
        System.out.println(divisao);
    }
}
