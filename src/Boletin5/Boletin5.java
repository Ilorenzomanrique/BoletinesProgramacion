/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //pedir datos
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("kilometros recorridos por el coche");
        float km = sc.nextFloat();
        
        System.out.println("Litros de consumo consumidos");
        float litros = sc.nextFloat();
        
        System.out.println("Velocidad media");
        float vMed = sc.nextFloat();
        
        System.out.println("Precio de la gasolina");
        float pGas = sc.nextFloat();
        
        //valores del enunciado objeto 1
        
        Consumo objCon1 = new Consumo();
        objCon1.setLitros(50);
        objCon1.setpGas((float) 1.51);
        
        //valores objeto 2
        
        litros = 56;
        
        Consumo objCon2 = new Consumo(km, litros, vMed, pGas);
        objCon2.mostrar("Velocidad media" + vMed);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
