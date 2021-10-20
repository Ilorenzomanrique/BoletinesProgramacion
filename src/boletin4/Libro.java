
package boletin4_1;


public class Libro {
    
    //atributos
    
    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //constructores
    
    public Libro(){
    }
    public Libro(String tit, String aut, int a, short nump){
        titulo = tit;
        autor = aut;
        año = a;
        numPaginas = nump;
    }
    
    //metodos
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
     public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
     public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    public void mostrar (){
        System.out.println("titulo: "+ titulo + "\n Autor: " + autor + "\n Año: " + año + "\n Numero de páginas: " + numPaginas + "\n Valoracion: " + valoracion);
    }
    public void mostrar2 (String titulo, String autor){
        System.out.println("titulo: "+ titulo + "\n Autor: " + autor + "\n Año: " + año + "\n Numero de páginas: " + numPaginas + "\n Valoracion: " + valoracion);
    }


}