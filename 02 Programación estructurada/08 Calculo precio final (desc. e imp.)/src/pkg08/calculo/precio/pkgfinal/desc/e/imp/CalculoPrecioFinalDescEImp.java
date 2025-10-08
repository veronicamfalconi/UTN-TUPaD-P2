/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.calculo.precio.pkgfinal.desc.e.imp;

import java.util.Scanner;

/**
 *8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
 * @author Veronica
 */
public class CalculoPrecioFinalDescEImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal = 0, impuestoPorcentaje, descuentoPorcentaje;
        
        System.out.println("Ingrese el precio base: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje. Ejemplo: 10 para 10%");
        impuesto = Double.parseDouble(input.nextLine());
        impuestoPorcentaje = impuesto/100;
        
        System.out.println("Ingrese el descuento en porcentaje. Ejemplo: 10 para 10%");
        descuento = Double.parseDouble(input.nextLine());
        descuentoPorcentaje = descuento/100;

        
        precioFinal = calcularPrecioFinal(precioBase, impuestoPorcentaje, descuentoPorcentaje);
        System.out.println("El precio final del producto es: " + precioFinal);
    } //cierre del main
    
    static double calcularPrecioFinal (double precio, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precio + (precio*impuesto) - (precio*descuento);
        return precioFinal;
    }
    
} //cierre de clase
