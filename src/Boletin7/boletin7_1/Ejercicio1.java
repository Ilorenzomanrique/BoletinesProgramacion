
package boletin7_1;

import java.util.Scanner;


public class Ejercicio1 {
    
    //atributos
    private int num;
    
    //constructores
    public Ejercicio1(){
    }
    
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        //pedimos número
        System.out.println("Introduce el número");
        num = sc.nextInt();
        //condicionales
        if(num >= 0){
            System.out.println("Es positivo");
        }
        
        
    }
    
    
    
    
    
    
    
}
