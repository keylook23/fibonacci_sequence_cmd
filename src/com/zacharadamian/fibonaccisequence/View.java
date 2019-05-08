/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zacharadamian.fibonaccisequence;

/**
 *
 * @author KeyLook
 */
public class View {
  
       public static void drawChart(int[] tab)
    {
        if (tab.length >= 2){
            int termSequence = tab.length - 1;
            System.out.println("\t^");
            for (int i = tab[tab.length - 1]; i >= 0; i--){
                System.out.print(i + 1 + "\t|");
                if (termSequence >= 0 && i + 1 == tab[termSequence]){
                    for (int j = 0; j < termSequence; j++){
                        System.out.print("\t");
                    }
                    System.out.print("*");
                    termSequence--;
                }
                System.out.println("");
            }
            for (int i = 0; i <= tab.length-1; i++){
                System.out.print("\t-");
            }
            System.out.print(" >\n");
            for (int i = 0; i <= tab.length-1; i++){
                System.out.print("\t" + i);
            }
        } 
        else{
            System.out.println("Ciąg musi zawierać przynajmniej 2 wyrazy");
        }
    }
}
