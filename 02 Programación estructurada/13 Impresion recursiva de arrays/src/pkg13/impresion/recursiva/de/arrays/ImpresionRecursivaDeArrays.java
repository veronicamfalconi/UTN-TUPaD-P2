/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.impresion.recursiva.de.arrays;

import java.util.Scanner;

/**
 *Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99

 * @author Veronica
 */
public class ImpresionRecursivaDeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion, valorModificar;
        double precioModificar;
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        double[] precios2 = precios.clone();
        
        do {            
            System.out.println("1. Mostrar los valores originales de los precios");
            System.out.println("2. Modificar el precio de un producto específico");
            System.out.println("3. Mostrar los valores modificados");
            
            opcion = Integer.parseInt(input.nextLine());
            switch (opcion) {
                case 1:
                    mostrarArray(precios);
                    break;
                case 2:
                    System.out.println("Ingrese el número del producto a modificar (del 1 al 5): ");
                    valorModificar = Integer.parseInt(input.nextLine()) - 1;
                    if (valorModificar >= 1 && valorModificar <=5) {
                        System.out.println("Ingrese el nuevo precio: ");
                        precioModificar = Double.parseDouble(input.nextLine());
                        precios2[valorModificar] = precioModificar;
                    } else {
                        System.out.println("Número de producto inválido");
                    }
                    break;
                case 3:
                    mostrarArray(precios2);
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
           
        } while (opcion != 0);
    } //cierre del main
    
    public static void mostrarArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double elemento = array[i];
            System.out.println(elemento + " ");
        }
    }
    
} //cierre de clase