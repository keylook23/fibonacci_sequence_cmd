/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zacharadamian.fibonaccisequence;

import static com.zacharadamian.fibonaccisequence.Model.calculateSequence;
import static com.zacharadamian.fibonaccisequence.View.drawChart;
import static com.zacharadamian.fibonaccisequence.Controller.Get;

/**
 * @author KeyLook
 */
public class Main {

    public static void main(String[] args) {
        //  String[] value;
        //drawChart(calculateSequence(scanner.nextInt()));
        if (args.length == 0) {
            System.out.print( "gui" );
        }
        else if (args.length <=1){
            System.out.print( args[0] );
            //drawChart( calculateSequence( Get() ) );
            System.out.print( "\n" );
            drawChart( calculateSequence( Integer.parseInt( args[0] ) ) );
        }
        else
        System.out.print( "help" );
    }
}

