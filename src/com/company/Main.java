package com.company;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    /**
     * Método donde comparamos valor1 con valor2 y se devuelve un mensaje en base a si valor2 es inferior, igual o superior a valor1
     * @param valor1 Es la primera nota del alumno
     * @param valor2 Es la segunda nota del alumno
     * @return Mensaje en base al resultado de la comparación
     */

    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

    public static void main(String[] args) {

        System.out.println("La calificación de " + args[0] + " " + args[1] +  " " + args[2] +" : ");
        System.out.println(veredicto(args[3], args[4]));
    }
}
