/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.contador.de.positivos.negativos.y.ceros;

import java.util.Scanner;

/**
 *6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 * @author Veronica
 */
public class ContadorDePositivosNegativosYCeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroIngresado, contadorPar = 0, contadorImpar = 0, contadorCeros = 0;
        
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese 10 números enteros: ");
            numeroIngresado = Integer.parseInt(input.nextLine());
            if (numeroIngresado % 2 != 0 && numeroIngresado != 0) {
                contadorImpar += 1;
            } else if (numeroIngresado != 0) {
                contadorPar += 1;
            } else {
                contadorCeros += 1;
            }
        }
        
        System.out.println("Números pares: " + contadorPar);
        System.out.println("Números impares: " + contadorImpar);
        System.out.println("Ceros: " + contadorCeros);
        
    } //cierre del main
    
} //cierre de clase
