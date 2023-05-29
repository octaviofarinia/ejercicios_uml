package ej_1_figuras;

public class Punto {
    private Double ejeX;

    private  Double ejeY;

    public Punto(Double ejeX, Double ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public Double getEjeX() {
        return ejeX;
    }

    public void setEjeX(Double ejeX) {
        this.ejeX = ejeX;
    }

    public Double getEjeY() {
        return ejeY;
    }

    public void setEjeY(Double ejeY) {
        this.ejeY = ejeY;
    }

}
