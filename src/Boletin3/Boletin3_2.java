/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        float centigrados;
        float fahrenheit;
        float kelvin = 273,15;
        float cambioKelvin;
        float cambioFahrenheit;
        Scanner sc = new Scanner(System.in);
        //pide datos
        System.out.println("Introduce grados centigrados");
        centigrados = sc.nextFloat();
        //calcula datos
        cambioKelvin = kelvin+centigrados;
        cambioFahrenheit = (centigrados*9/5)+32;
        //muestra resultados
        System.out.println(cambioKelvin+" grados kelvin "+cambioFahrenheit+" grados fahrenheit")
        
    }
    
}
