/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zacharadamian.fibonaccisequence;

//import static com.zacharadamian.fibonaccisequence.View.drawChart;
import java.util.Scanner;

/**
 *
 * @author KeyLook
 */
public class Controller {
      public static int Get ()
    {
        
        
        Scanner scanner = new Scanner(System.in);       //te dwoe ;oie maja byc jako funkcja klasy controller
        System.out.println("Podaj ilość wyrazów ciągu do wyliczenia: ");
 //Integer i = Integer.valueOf(scanner);
        //drawChart(calculateSequence(scanner.nextInt()));
       // System.out.print("\n");
    return scanner.nextInt();
    }   
}
