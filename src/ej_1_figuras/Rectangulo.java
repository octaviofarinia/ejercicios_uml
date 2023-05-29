package ej_1_figuras;

import java.util.List;

public class Rectangulo extends Poligono {
    public Rectangulo(List<Double[]> ladosArrays) throws Exception {
        super(ladosArrays);
        if (ladosArrays.size() != 4) {
            throw new Exception("La figura debe tener 4 lados.");
        }
    }
}
