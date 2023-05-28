package ej_2_paises;

import java.util.List;

public class Pais {

    private String nombre;

    private List<Provincia> provincias;

    private List<Pais> paisesLimitrofes;

    public Pais(String nombre, List<Provincia> provincias, List<Pais> paisesLimitrofes) throws Exception {
        if(provincias.isEmpty()) {
            throw new Exception("Un Pais debe contener por lo menos una provincia.");
        }

        this.nombre = nombre;
        this.provincias = provincias;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

}
