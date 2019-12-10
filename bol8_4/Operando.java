/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Operando {

    private int numero;
    Scanner teclado = new Scanner(System.in);

    public Operando() {
    }

    public Operando(int num) {
        numero = num;
    }

    public void setNumero(Scanner teclado) {
        System.out.println("Dime un numero: ");
        numero = teclado.nextInt();
    }

    public int getNumero() {
        return numero;
    }

    public int pedirNumero() {
        System.out.println("Siguiente numero: ");
        return teclado.nextInt();
    }

    public String operacion() {
        int i = 1;
        int carro = 0;
        int nume = pedirNumero();
        while (i != 10) {
            System.out.println("Ronda " + i);
            if (nume % 2 == 0) {
                carro = carro + nume;
                System.out.println("+");
                nume = pedirNumero();
            } else {
                carro = carro * nume;
                System.out.println("*");
                nume = pedirNumero();
            }
            i++;
        }
        return ("El resultado final es de " + carro);
    }
}
