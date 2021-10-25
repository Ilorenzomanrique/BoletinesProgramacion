
package boletin6;

import java.util.Scanner;


public class Boletin6 {

    
    public static void main(String[] args) {
        int masVelocidad;
        int menosVelocidad;
        
        Scanner sc = new Scanner(System.in);
        
        Coche coche = new Coche();
        
        System.out.println("La velocidad del coche es "+ coche.getVelocidad()+"km/h");
        
        System.out.println("Introduce la velocidad en km/h");
        masVelocidad = sc.nextInt();
        
        coche.acelerar(masVelocidad);
        
        System.out.println("La velocidad del coche es "+ coche.getVelocidad()+"km/h");
        
        System.out.println("Introduce la velocidad a frenar en km/h");
        
        menosVelocidad = sc.nextInt();
        
        coche.frenar(menosVelocidad);
        
        System.out.println("La velocidad actual del coche es "+coche.getVelocidad()+"km/h");

        
        
        
        
    }
    
}
