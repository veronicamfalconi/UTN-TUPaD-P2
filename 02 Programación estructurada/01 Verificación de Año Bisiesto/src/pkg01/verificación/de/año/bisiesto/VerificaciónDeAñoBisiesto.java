/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.verificación.de.año.bisiesto;

import java.util.Scanner;

/**
 *
 * @author Veronica
 * Escribe un programa en Java que solicite al usuario un año y determine si es
 * bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
 * divisible por 400.
 * Ejemplo de entrada/salida:
 * Ingrese un año: 2024
 * El año 2024 es bisiesto.
 * Ingrese un año: 1900
 * El año 1900 no es bisiesto.

 */
public class VerificaciónDeAñoBisiesto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anioBisiesto;
        boolean esBisiesto;
        
        System.out.println("Ingrese un año para verificar si es bisiesto: ");
        anioBisiesto = Integer.parseInt(input.nextLine());
        esBisiesto = true;
        
        if (anioBisiesto % 4 == 0) {
            if (anioBisiesto % 100 == 0) {
                if(anioBisiesto % 400 == 0) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }
        
        if (esBisiesto ==  true) {
            System.out.println("El año " + anioBisiesto + " es bisiesto.");
        } else {
            System.out.println("El año " + anioBisiesto + " no es bisiesto.");
        }
        
    } //cierre de main
    
} //cierre de clase
