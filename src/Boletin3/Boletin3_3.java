/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double billete100;
        double billete20;
        double billete5;
        double moneda1;
        double equivalente;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce billetes de 100");
        billete100 = sc.nextDouble();
        System.out.println("Introduce billetes de 20");
        billete20 = sc.nextDouble();
        System.out.println("Introduce billetes de 5");
        billete5 = sc.nextDouble();
        System.out.println("Introduce monedas de 1");
        moneda1 = sc.nextDouble();
        resultado = billete100*100+billete20*20+billete5*5+moneda1;
        System.out.println("tienes"+resultado+"euros");
        
    }
    
}
