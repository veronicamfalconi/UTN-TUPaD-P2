/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.calculo.descuento.especial.usando.variable.global;

import java.util.Scanner;

/**
 *Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0

 * @author Veronica
 */
public class CalculoDescuentoEspecialUsandoVariableGlobal {

    static double entradaSalida = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, descuentoAplicado, precioFinal;
        
        System.out.println("Ingrese el precio del producto");
        precioProducto = Double.parseDouble(input.nextLine());
        
        descuentoAplicado = descuentoAplicado (precioProducto);
        precioFinal = precioProducto - descuentoAplicado;
        System.out.println("El descuento especial aplicado es de " + descuentoAplicado);
        System.out.println("El precio final con descuento es " + precioFinal);
        
        
    } //cierre de main
    
    public static double descuentoAplicado ( double precio ) {
        double descuentoAplicado;
        descuentoAplicado = precio * entradaSalida;
        return descuentoAplicado;
    }
    
} //cierre de clase
