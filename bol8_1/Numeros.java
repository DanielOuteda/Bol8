/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */

public class Numeros {
    Scanner sc = new Scanner(System.in);
    private float numeros;
    
    public Numeros(){
    }
    public Numeros(float num){
        numeros=num;
    }
    public void Cantidade(float num){
        System.out.println("Escribe o numero: ");
        numeros = sc.nextFloat();
    }
    
    public void Cuentas(){
        if (numeros<500)
            System.out.println("Cantidade: "+numeros+"\nIncremeto: "+numeros*50/100+"\nCantidade Final:"+(numeros+((numeros*50)/100)));
        else if (numeros<=1000)
            System.out.println("Cantidade: "+numeros+"\nIncremeto: "+numeros*7/100+"\nCantidade Final:"+(numeros+((numeros*7)/100)));
        else if (numeros<=5000)
            System.out.println("Cantidade: "+numeros+"\nIncremeto: "+numeros*15/100+"\nCantidade Final:"+(numeros+((numeros*15)/100)));
        else 
            System.out.println("Cantidade: "+numeros+"\nDecrecimiento: -"+numeros*3/100+"\nCantidade Final:"+(numeros-((numeros*3)/100)));
    }
}
