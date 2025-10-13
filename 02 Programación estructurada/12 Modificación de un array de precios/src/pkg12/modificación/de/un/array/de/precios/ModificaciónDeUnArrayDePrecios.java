/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.modificación.de.un.array.de.precios;

import java.util.Scanner;

/**
 *12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
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
Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con for-each para mostrar valores.
✔ Modificación de un valor en un array mediante un índice.
✔ Reimpresión del array después de la modificación.
 * @author Veronica
 */
public class ModificaciónDeUnArrayDePrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion, valorModificar;
        double precioModificar;
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        double[] precios2 = new double[5];
        
        do {            
            System.out.println("1. Mostrar los valores originales de los precios");
            System.out.println("2. Modificar el precio de un producto específico");
            System.out.println("3. Mostrar los valores modificados");
            
            opcion = Integer.parseInt(input.nextLine());
            switch (opcion) {
                case 1:
                    for (int i = 0; i < precios.length; i++) {
                        double precio = precios[i];
                        System.out.println(precio + " ");
                        
                    }
                    break;
                case 2:
                    for (int i = 0; i < precios.length; i++) {
                        precios2[i] = precios[i];     
                    }
                    System.out.println("Ingrese el precio a modificar (del 1 al 5): ");
                    valorModificar = Integer.parseInt(input.nextLine());
                    System.out.println("Ingrese el nuevo precio: ");
                    precioModificar = Double.parseDouble(input.nextLine());
                    precios2[valorModificar-1] = precioModificar;
                    break;
                case 3:
                    for (int i = 0; i < precios2.length; i++) {
                        double precio = precios2[i];
                        System.out.println(precio + " ");
                    }
            }
           
        } while (opcion != 0);
    } //cierre del main
    
} //cierre de clase
