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
public class Model {
    public static int[] calculateSequence(int i)
    {
       int termsSequence[] = new int[i]; 
        if (i >= 2)
        {
            termsSequence[0] = 1;
            termsSequence[1] = 2;
            for (int n = 2; n < termsSequence.length; n++) 
            {
                termsSequence[n] = termsSequence[n - 2] + termsSequence[n - 1];  
            }
        } 
        else
        {
        System.out.println("Ciąg musi zawierać przynajmniej 2 wyrazy");
        }
        return termsSequence;
    } 
    
}
