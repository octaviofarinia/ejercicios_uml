package ej_1_figuras;

import java.util.Objects;

public class Circulo extends Elipse {

    public Circulo(Double longitudEjeMayor, Double longitudEjeMenor, Double centroX, Double centroY) throws Exception {
        super(longitudEjeMayor, longitudEjeMenor, centroX, centroY);
        if(!Objects.equals(longitudEjeMayor, longitudEjeMenor)) {
            throw new Exception("Un circulo debe tener su eje mayor y meno de igual longitud.");
        }
    }


}
