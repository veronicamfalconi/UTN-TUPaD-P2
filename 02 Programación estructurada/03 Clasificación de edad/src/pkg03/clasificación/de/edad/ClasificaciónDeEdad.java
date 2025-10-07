/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.clasificación.de.edad;

import java.util.Scanner;

/**
 *3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
Ejemplo de entrada/salida:
Ingrese su edad: 25
Eres un Adulto.
Ingrese su edad: 10
Eres un Niño.

 * @author Veronica
 */
public class ClasificaciónDeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edadIngresada;
        
        System.out.println("Ingrese su edad: ");
        edadIngresada = Integer.parseInt(input.nextLine());
        
        if (edadIngresada < 12) {
            System.out.println("Eres un niño");
        } else if (edadIngresada <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edadIngresada <=59) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    } //cierre del main
    
} //cierre de clase
