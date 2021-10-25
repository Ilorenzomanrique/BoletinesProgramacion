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
public class Consumo {
    Scanner sc=new Scanner(System.in);
    //atributos
    
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
   
    
    //constructores
    
    public Consumo(){
    }
    public Consumo(float kms, float lit, float vm, float prgas){
        
        km = kms;
        litros = lit;
        vMed = vm;
        pGas = prgas;
    }
    
    //metodos de acceso
    
    public float getTiempo(){
        return km/vMed;
    }
    public float consumoMedio(){
        return litros*100/km;
    }
    public float consumoEuros(){
        return pGas*consumoMedio();
    }
    public void setKms(float km){
        this.km = km;
    }
    public void setLitros(float litros){
        this.litros = litros;
    }
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    public void setpGas(float pGas){
        this.pGas = pGas;
    }

    void mostrar(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
}
