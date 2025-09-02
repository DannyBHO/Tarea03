/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea03;

/**
 *
 * @author Danny
 */
public class Tarea03 {

    public static void main(String[] args) {
       String[] ciudades = {"Quito", "Guayaquil"};

        double[][][] temperaturas = {
            {   // Quito
                {20, 22, 21, 19, 23, 24, 25},   // Semana 1
                {18, 21, 22, 20, 19, 23, 24}    // Semana 2
            },
            {   // Guayaquil
                {28, 30, 29, 27, 31, 32, 33},   // Semana 1
                {27, 29, 28, 30, 32, 33, 34}    // Semana 2
            }
        };

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("\nCiudad: " + ciudades[i]);
            for (int j = 0; j < temperaturas[i].length; j++) {
                double suma = 0;
                for (int k = 0; k < temperaturas[i][j].length; k++) {
                    suma += temperaturas[i][j][k];
                }
                double promedio = suma / temperaturas[i][j].length;
                System.out.println("  Semana " + (j + 1) + ": Promedio de temperatura = " + promedio + " C");
            }
        }
    }
}