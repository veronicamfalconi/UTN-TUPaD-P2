/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.suma.de.números.pares;

import java.util.Scanner;

/**
 * Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
 * @author Veronica
 */
public class SumaDeNúmerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroIngresado, sumaPar = 0;
        
        System.out.println("Ingrese un número o presione 0 para terminar");
        numeroIngresado = Integer.parseInt(input.nextLine());
        
        while (numeroIngresado != 0) {
            if(numeroIngresado % 2 == 0) {
                sumaPar += numeroIngresado;
            }
            numeroIngresado = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma total de los números pares es " + sumaPar);
    } //cierre del main
    
} //cierre de clase
