/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1.pkg4;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class TP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }
    
}
