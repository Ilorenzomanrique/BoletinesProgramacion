
package boletin7_2;

import java.util.Scanner;


public class Ejercicio2 {
    //atributos
    private short num1;
    private short num2;
    
    //constructores
    public Ejercicio2(){
    }
    
    //metodos
    
    public void condicional(){
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.println("Introduce primer número");
        num1 = sc.nextShort();
        System.out.println("Introduce segundo número");
        num2 = sc.nextShort();
        //hacemos los condicionales
        if(num1>=num2){
            System.out.println("La resta es = "+ (num1-num2));
        }
        System.out.println("La suma es = "+ (num1+num2));
        
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}
