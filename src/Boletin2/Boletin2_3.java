/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros;
        float valor_Dolares;
        float cambio;
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea los euros: ");
        euros=sc.nextFloat();
        System.out.println("Teclea el valor actual del dolar:");
        valor_Dolares=sc.nextFloat();
        cambio=valor_Dolares*euros;
        System.out.println("El cambio son "+cambio+" dolares");
    }
    
}
