/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1.pkg88;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class TP188 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double division;
        
        System.out.println("Ingrese el primer número");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el sgundo número");
        num2 = Integer.parseInt(input.nextLine());
        
        division = num1 / num2;
        
        System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es " + division + "\n");
        
        int num3, num4;
        int division1;
        
        System.out.println("Ingrese el primer número");
        num3 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el sgundo número");
        num4 = Integer.parseInt(input.nextLine());
        
        division = (double) num1 / num2;
        
        System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es " + division);
    }
    
}
