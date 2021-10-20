
package boletin4_1;


public class Boletin4_1 {

    
    public static void main(String[] args) {
        Libro objLi1 = new Libro();
        objLi1.mostrar();
        Libro objLi2 = new Libro("aaa", "bbb", 2021, (short)450);
        objLi2.mostrar();
        Libro objLi3 = new Libro("aaaa", "bbbb", 2000, (short)300);
        objLi3.mostrar2("Harry Potter", "JKRowling");
        
        
        
    }
    
}
