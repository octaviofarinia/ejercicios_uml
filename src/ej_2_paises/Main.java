package ej_2_paises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 2 - Paises");

        //ARGENTINA Y MENDOZA
        Ciudad mendozaCiudad = new Ciudad("Mendoza Capital");

        Provincia mendoza = new Provincia(
                "Mendoza",
                false,
                Collections.singletonList(mendozaCiudad),
                null,
                null
        );

        Pais argentina = new Pais("Argentina", Collections.singletonList(mendoza), null);

        //CHILE Y SANTIAGO
        Ciudad santiagoCiudad = new Ciudad("Santiago");

        Provincia santiago = new Provincia(
                "Santiago",
                true,
                Collections.singletonList(santiagoCiudad),
                Collections.singletonList(mendoza),
                Collections.singletonList(argentina)
        );

        Pais chile = new Pais("Chile", Collections.singletonList(santiago), Collections.singletonList(argentina));

        argentina.agregarPaisLimitrofe(chile);
        mendoza.agregarPaisLimitrofe(chile);
        mendoza.agregarProvinciaLimitrofe(santiago);

        //AMERICA DEL SUR
        List<Pais> paisesAmericaDelSur = new ArrayList<>();
        paisesAmericaDelSur.add(argentina);
        paisesAmericaDelSur.add(chile);
        Continente americaDelSur = new Continente("America del Sur", paisesAmericaDelSur);
    }
}