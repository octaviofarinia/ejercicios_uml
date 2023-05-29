package ej_2_paises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Provincia {

    private String nombre;

    private boolean isCapital;

    private List<Ciudad> ciudades;

    private List<Provincia> provinciasLimitrofes;

    private List<Pais> paisesLimitrofes;

    public Provincia(String nombre, boolean isCapital, List<Ciudad> ciudades, List<Provincia> provinciasLimitrofes, List<Pais> paisesLimitrofes) throws Exception {
        if(ciudades == null || ciudades.isEmpty()) {
            throw new Exception("Una Provincia debe tener por lo menos una ciudad.");
        }

        this.nombre = nombre;
        this.isCapital = isCapital;
        this.ciudades = ciudades;

        this.provinciasLimitrofes = Optional.ofNullable(provinciasLimitrofes).orElse(new ArrayList<>());
        this.paisesLimitrofes = Optional.ofNullable(paisesLimitrofes).orElse(new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public List<Provincia> getProvinciasLimitrofes() {
        return provinciasLimitrofes;
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        this.provinciasLimitrofes.add(provincia);
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

}
