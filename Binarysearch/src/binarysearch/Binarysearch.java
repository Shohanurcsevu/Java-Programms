/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author S R Bishwas
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arra={23,1,56,3,89,77,56,44};
        
        for(int t:arra)
        {
            System.out.println(t);
        }
        
        Arrays.sort(arra);
        
        System.out.println("After Shorting Array:");
        
        for(int k:arra)
        {
            System.out.println(k); 
        }
        
        int serachValue=56;
        
        int retVal=Arrays.binarySearch(arra, serachValue);
        
        System.out.println("The Value Is : in : "+retVal);
    }
    
}
