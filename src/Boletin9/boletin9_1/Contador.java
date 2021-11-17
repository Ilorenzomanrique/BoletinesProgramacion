/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Contador {
    private int pos=0, neg=0, cero=0;
    
    public void mostrarBucle(){
        int num;
        
        for(int cont=0;cont<10;cont++){
            num=getNum();
            if (num>0){
                pos++;
            }
            else{
                if(num<0){
                    neg++;
                }
                else{
                    cero++;
                }
            }
            
            
        }
        System.out.println(pos +" positivos, " + neg + " negativos "+cero+" ceros");
        
    }
    
    public int getNum(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
        return num;
    }
    
    
    
    
    
    
}
