/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float primerNumero , segundoNumero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer valor:");
        primerNumero=sc.nextFloat();
        System.out.println("Introduzca el segundo valor:");
        segundoNumero=sc.nextFloat();
        float suma=primerNumero+segundoNumero;
        float resta=primerNumero-segundoNumero;
        float producto=primerNumero*segundoNumero;
        float cociente=primerNumero/segundoNumero;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado del producto es: "+producto);
        System.out.println("El resultado del cociente es: "+cociente);
    }
    
}
