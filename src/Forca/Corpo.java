package Forca;

public class Corpo {
    double forca;
    double massa;
    double aceleracao;

    public Corpo() {
        forca = 0.0;
        massa = 0.0;
    }

    public Corpo(double forca, double massa) {
        this.forca = forca;
        this.massa = massa;
    }

    public double calcularAceleracao() {
        aceleracao = (massa != 0.0) ? forca/massa : 0.0;
        return aceleracao;
    }

    public double getAceleracao() {
        return (aceleracao != 0) ? aceleracao : calcularAceleracao();
    }
}
