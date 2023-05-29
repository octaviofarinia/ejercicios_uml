package ej_1_figuras;

public class Lado {

    private Punto punto1;

    private Punto punto2;

    private Double longitud;

    public Lado(Double ejeX1, Double ejeY1, Double ejeX2, Double ejeY2) {
        this.punto1 = new Punto(ejeX1, ejeY1);
        this.punto2 = new Punto(ejeX2, ejeY2);
        this.longitud = calcularLongitud();
    }

    private Double calcularLongitud() {
        double deltaX = punto2.getEjeX() - punto1.getEjeX();
        double deltaY = punto2.getEjeY() - punto1.getEjeY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

}
