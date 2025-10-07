/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.descuento;

import java.util.Scanner;

/**
 *4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
 * @author Veronica
 */
public class CalculadoraDeDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, precioFinal = 0, descuentoAplicado = 0;
        char categoria;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch (categoria) {
            case 'A':
                descuentoAplicado = (precioProducto * 0.10);
                precioFinal = (precioProducto - descuentoAplicado);
                break;
            case 'B':
                descuentoAplicado = (precioProducto * 0.15);
                precioFinal = (precioProducto - descuentoAplicado);
                break;
            case 'C':
                descuentoAplicado = (precioProducto * 0.20);
                precioFinal = (precioProducto - descuentoAplicado);
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("El descuento aplicado es de $" + descuentoAplicado + " y el precio final es de $" + precioFinal);
    } //cierre del main
    
} //cierre de clase
