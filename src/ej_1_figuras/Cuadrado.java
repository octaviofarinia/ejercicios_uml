package ej_1_figuras;

import java.util.List;
import java.util.Objects;

public class Cuadrado extends Rectangulo {
    public Cuadrado(List<Double[]> ladosArrays) throws Exception {
        super(ladosArrays);

        Lado lado = this.lados.get(0);
        for (int i = 1; i <= 3; i++) {
            if (!Objects.equals(lado.getLongitud(), lados.get(i).getLongitud())) {
                throw new Exception("Un cuadrado debe tener todos sus lados iguales.");
            }
        }
    }
}
