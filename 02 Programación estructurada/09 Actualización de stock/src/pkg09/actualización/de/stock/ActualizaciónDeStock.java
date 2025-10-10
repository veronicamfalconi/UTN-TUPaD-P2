/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.actualización.de.stock;

import java.util.Scanner;

/**
 *Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
 * @author Veronica
 */
public class ActualizaciónDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.println("Ingrese el stock actual del producto");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida del producto");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida del producto");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
    } // cierre del main
    
    public static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
} // cierre de clase
