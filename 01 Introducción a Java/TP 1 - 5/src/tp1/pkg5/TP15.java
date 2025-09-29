/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.pkg5;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class TP15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, producto;
        double division;
        
        System.out.println("Ingrese el primer número");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo número");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = (double) num1 / num2;
        
        System.out.println("La suma entre " + num1 + " y " + num2 + " es de " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 + " es de " + resta);
        System.out.println("El producto entre " + num1 + " y " + num2 + " es de " + producto);
        System.out.println("La división entre " + num1 + " y " + num2 + " es de " + division);
    }
    
}
