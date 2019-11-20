/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_2;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    public void Compras(){
    Scanner sc= new Scanner(System.in);
  
    System.out.println("Unidades: ");
        int unidad= sc.nextInt();

    System.out.println("Precio: ");
        float precio= sc.nextFloat();
        float total= unidad*precio;
        float desconto= 0;
    
        if (unidad < 100) {
            desconto= 0;
        } else if (unidad < 200) {
            if (precio > 4000) {
                desconto= precio*unidad*0.95f;
            } else {
                desconto= precio*unidad*0.98f;
            }
        } else if (unidad >= 200) {
            if (precio > 4000) {
                desconto= precio*unidad*0.9f;
            } else {
                desconto= precio*unidad*0.92f;
            }
        }
        System.out.println("Unidades: " +unidad);
        System.out.println("Precio por unidad: " +precio +"€");
        System.out.println("Precio: " +total +"€");
        System.out.println("Descuento: " +desconto + "€");
    }
}
