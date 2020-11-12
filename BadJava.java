/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.badjava;

/**
 *
 * @author jared
 */


public class BadJava {
    
    static void printLocal(){
        int x = 10;
        System.out.print(x);
    }
    
    public static void main(String[] args) {
        //define some fields
        int x = 5;
        int Int = 10;
        boolean notTrue = false;
        int noName;
        String noString;
        String emptyString="";
        
        //define some illegal field names
        boolean boolean = true;
        
      //  print values;
        System.out.printf("x is %s \n "
                + "Int is %s \n"
                + "tRue is %s \n"
                + "noName is %s \n"
                + "noString is %s \nm"
                + "emptyString is %s", 
                x, Int, notTrue, noName, noString, emptyString);
        
        //print local variable
        printLocal();
    }
    
   
}
