/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tarifa;
        float precio;
        float descuento;
        float porcentaje;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la tarifa");
        tarifa = sc.nextFloat();
        System.out.println("Introduce el precio pagado");
        precio = sc.nextFloat();
        descuento = tarifa - precio;
        porcentaje = descuento * 100 / tarifa;
        System.out.println(porcentaje+"%");
    }
    
}
