/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NewClass {
    public static void main(String[]args){
        Scanner entrada =new Scanner (System.in);
     
        double salario=1000.00;
        int total_carros;
        System.out.println("Quantos carros você vendeu?");
        total_carros=entrada.nextInt();
        if (total_carros<=5){
            total_carros= total_carros*500;
            salario=salario+total_carros;
            System.out.println("Valoe do salarocoma comissão"+salario);
        }
       
    }
}
