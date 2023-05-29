package ej_1_figuras;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends FiguraBase {

    protected List<Lado> lados;

    public Poligono(List<Double[]> ladosArrays) throws Exception {
        super();
        if(ladosArrays.size() < 3) {
            throw new Exception("Un poligono debe tener por lo menos 3 lados.");
        }

        List<Lado> ladosList = new ArrayList<>();

        for (Double[] arrayLado : ladosArrays) {
            ladosList.add(new Lado(arrayLado[0], arrayLado[1], arrayLado[2], arrayLado[3]));
        }

        this.lados = ladosList;
    }

}
