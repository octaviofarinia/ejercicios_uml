package ej_2_paises;

import java.util.List;

public class Continente {
    private String nombre;

    private List<Pais> paises;

    public Continente(String nombre, List<Pais> paises) throws Exception {
        if(paises.isEmpty()) {
            throw new Exception("Un contienente debe tener por lo menos un pais.");
        }

        this.nombre = nombre;
        this.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void agregarPais(Pais pais) {
        this.paises.add(pais);
    }

}
