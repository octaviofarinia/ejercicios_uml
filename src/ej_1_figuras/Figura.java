package ej_1_figuras;

import java.util.List;

public class Figura {

    private List<FiguraBase> figurasBase;

    public Figura(List<FiguraBase> figurasBase) throws Exception {
        if (figurasBase.isEmpty()) {
            throw new Exception("Una figura debe contar por lo menos con una figura base.");
        }
        this.figurasBase = figurasBase;
    }

    public List<FiguraBase> getFigurasBase() {
        return figurasBase;
    }

    public void setFigurasBase(List<FiguraBase> figurasBase) {
        this.figurasBase = figurasBase;
    }

}
