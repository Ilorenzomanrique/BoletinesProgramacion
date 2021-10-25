
package boletin6;


public class Coche {
    
    private int velocidad;
    
    public Coche() {
    velocidad = 0;
}
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void acelerar (int masVelocidad){
        velocidad += masVelocidad; 
    }
    
    public void frenar (int menosVelocidad){
        velocidad -= menosVelocidad;
        
        if (velocidad<0){
            velocidad = 0;
        }
            
    }
    
    




}
