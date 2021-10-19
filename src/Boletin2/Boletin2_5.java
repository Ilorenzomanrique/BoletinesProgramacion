/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float millas;
        Scanner sc=new Scanner(System.in)
        System.out.println("introduce numero de millas");
        millas=sc.nextFloat();
        float metros = millas * 1852
        System.out.println("Son "+metros+" metros");
    }
    
}
