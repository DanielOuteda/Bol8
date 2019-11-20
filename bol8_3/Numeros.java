/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    private int mes;
    Scanner sc=new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea el mes: ");
        mes=sc.nextInt();
        return mes;
    }
    
    public void Calcular(){
        int dias = 0;
        mes= pedirDatos();
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias= 31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias= 30;
            }
            else if (mes == 2) {
            dias= 28;
            }
        System.out.println("El mes "+mes+" tiene "+dias+" dias");
    }
}
