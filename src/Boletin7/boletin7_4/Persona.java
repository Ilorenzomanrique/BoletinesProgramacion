
package boletin7_4;

import java.util.Scanner;


public class Persona {
    //atributos
    private String nom1;
    private String nom2;
    private float peso1;
    private float peso2;
    
    //constructores
    public Persona(){
    }
    
    //metodos
    
    public void comparar(){
        Scanner sc = new Scanner(System.in);
        //recogemos datos
        System.out.println("Introduce el nombre de la primera persona");
        nom1 = sc.toString();
        System.out.println("Introduce su peso");
        peso1 = sc.nextFloat();
        System.out.println("Introduce el nombre de la segunda persona");
        nom2 = sc.toString();
        System.out.println("Introduce su peso");
        peso1 = sc.nextFloat();
        
        //condiciones
        
        
    }
    
    
    
    
    
}
