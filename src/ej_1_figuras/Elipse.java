package ej_1_figuras;

public class Elipse extends FiguraBase {

    protected Double longitudEjeMayor;

    protected Double longitudEjeMenor;

    protected Punto centro;

    public Elipse(Double longitudEjeMayor, Double longitudEjeMenor, Double centroX, Double centroY) {
        this.longitudEjeMayor = longitudEjeMayor;
        this.longitudEjeMenor = longitudEjeMenor;
        this.centro = new Punto(centroX, centroY);
    }
}
