/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {
    //atributos
    private int num;
    
    //constructores
    
    public Ejercicio3(){
    }
    
    //metodos
    public void condicionalDoble(){
        Scanner sc = new Scanner(System.in);
        //pedir datos
        System.out.println("Introduce numero");
        num = sc.nextInt();
        //condicionales
        if (num>0){
            System.out.println("+");
        }
        else{
            if(num == 0){
                System.out.println(0);
            }
            else{
                System.out.println("-");
            }
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
