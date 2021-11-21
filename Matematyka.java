/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

/**
 *
 * @author w65143
 */
public class Matematyka{
    public int dodaj(int a,int b){
        System.out.println("Wywołano metodę o wartościach int, posiada 2 parametry "+a+","+b);
     return a+b ; 
    }
    
    /**
     * @param args the command line arguments
     */
    public double dodaj(double a, double b, double c){
        System.out.println("Wywołano metodę o wartościach int, posiada 3 parametry "+a+","+b+","+c);
         return a+b+c ; 
    }
    
}