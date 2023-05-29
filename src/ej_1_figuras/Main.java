package ej_1_figuras;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1 - Figuras");

        //Crear figura compuesta por un circulo, un triangulo y un cuadrado

        //1) creo un circulo en el eje de cordenadas con radio 5
        Circulo circulo = new Circulo(10.0d, 10.0d, 0.0d, 0.0d);

        //2) creo un triangulo que estara contenido dentro del circulo.
        Triangulo triangulo = new Triangulo(Arrays.asList(
                new Double[]{5.0, 0.0, -5.0, 0.0},
                new Double[]{-5.0, 0.0, 0.0, 5.0},
                new Double[]{0.0, 5.0, 5.0, 0.0}
        ));

        //3) creo cuadrado
        Cuadrado cuadrado = new Cuadrado(Arrays.asList(
                new Double[]{5.0, 0.0, -5.0, 0.0},
                new Double[]{-5.0, 0.0, -5.0, -10.0},
                new Double[]{-5.0, -10.0, 5.0, -10.0},
                new Double[]{5.0, -10.0, 5.0, 0.0}
        ));

        Figura figura = new Figura(Arrays.asList(
                circulo,
                triangulo,
                cuadrado
        ));

    }
}