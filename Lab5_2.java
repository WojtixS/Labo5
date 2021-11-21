/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;
import java.util.InputMismatchException;
import java.util.Scanner;
import 
/**
 *
 * @author w65143
 */
public class Lab5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner (System.in);
        
        double liczba = 0;
        
        while(true){
            try{
                liczba = input.nextDouble();
                break;
                
            }
            catch(InputMismatchException e){
                System.out.println("Podaj poprawną liczbę");
                input.next();
            }
        }
        if (liczba < 0){
            throw new IllegalArgumentException(
                    String.format("pierwiastek kwadratowy z liczby rzeczywistej"
                    +"<0 nie istnieje"));
        }
            System.out.println(String.format("Pierwiastek z "+liczba+"wynosi:"+ Math.sqrt(liczba))));
                    
        
    }
    
}
