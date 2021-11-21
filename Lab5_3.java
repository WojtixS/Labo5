/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author w65143
 */
public class Lab5_3 {

    void WypiszDlugosc(String napis){
     System.out.println(napis.length());   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         Lab5_3 ob = new Lab5_3();
         //pkt2
        try{
       ob.WypiszDlugosc("ala");
       ob.WypiszDlugosc(null);
    }
        catch(NullPointerException e){
          //  e.printStackTrace(System.out);
           // e.fillInStackTrace(); //pkt5
           // throw e; //pkt3
            //pkt 4 - tak
            //pkt 6
            throw new Exception(e); //pkt7
        }
        }
}
