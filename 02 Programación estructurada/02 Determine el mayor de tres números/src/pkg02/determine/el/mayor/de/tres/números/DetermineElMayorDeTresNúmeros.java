/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.determine.el.mayor.de.tres.números;

import java.util.Scanner;

/**
 *2. Determinar el Mayor de Tres Números.
 * Escribe un programa en Java que pida al usuario tres números enteros y
 * determine cuál es el mayor.
 * Ejemplo de entrada/salida:
 * Ingrese el primer número: 8
 * Ingrese el segundo número: 12
 * Ingrese el tercer número: 5
 * El mayor es: 12
 * @author Veronica
 */
public class DetermineElMayorDeTresNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, esMayor;
        
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        
        if (num1 > num2 && num1 > num3) {
            esMayor = num1;
        } else {
            if (num2 > num3) {
                esMayor = num2;
            } else {
                esMayor = num3;
            }
        }
        
        System.out.println("El número mayor ingresado es el " + esMayor + ".");
    } // cierre del main
    
} // cierre de clase
