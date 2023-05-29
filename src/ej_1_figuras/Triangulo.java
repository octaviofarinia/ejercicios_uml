package ej_1_figuras;

import java.util.List;

public class Triangulo extends Poligono {
    public Triangulo(List<Double[]> ladosArrays) throws Exception {
        super(ladosArrays);
        if (ladosArrays.size() != 3) {
            throw new Exception("Un triangulo debe tener exactamente 3 lados.");
        }
    }
}
