/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.composición.de.funciones;

import java.util.Scanner;

/**
 *Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
 * @author Veronica
 */
public class ComposiciónDeFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, pesoPaquete, costoEnvio = 0, totalCompra = 0;
        String zonaEnvio;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envío (Nacional o Internacional): ");
        zonaEnvio = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        
        totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es de; " + costoEnvio);
        System.out.println("El total a pagar es de: " + totalCompra);
        
    } //cierre del main
    
    static double calcularCostoEnvio (double peso, String zona) {
        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = ( peso * 5 );
        } else {
            costoEnvio = ( peso * 10 );
        }
        return costoEnvio;
    }
            
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double precioTotal;
        precioTotal = ( precioProducto + costoEnvio );
        return precioTotal;
    }
    
} //cierre de clase
