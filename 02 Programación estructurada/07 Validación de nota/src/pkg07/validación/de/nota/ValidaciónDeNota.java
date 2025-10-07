/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.validación.de.nota;

import java.util.Scanner;

/**
 *7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.

 * @author Veronica
 */
public class ValidaciónDeNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notaIngresada;
        System.out.println("Ingrese una nota (0-10): ");
        notaIngresada = Integer.parseInt(input.nextLine());
        do {            
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            notaIngresada = Integer.parseInt(input.nextLine());
        } while (notaIngresada > 10 || notaIngresada < 0 );
        System.out.println("Nota guardada");
    } //cierre del main
    
} //cierre de clase
