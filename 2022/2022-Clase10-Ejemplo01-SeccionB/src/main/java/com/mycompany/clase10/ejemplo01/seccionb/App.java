/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase10.ejemplo01.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        int codigoProducto, cantidadProducto;
        float precioProducto, totalVenta;
        
        codigoProducto = cantidadProducto = 0;
        precioProducto = totalVenta = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el código de producto: ");
        codigoProducto = scan.nextInt();
        System.out.print("Ingrese la cantidad de producto: ");
        cantidadProducto = scan.nextInt();
        
        switch (codigoProducto) {
            case 1:
                precioProducto = 2.98f;
                break;
            case 2:
                precioProducto = 4.50f;
                break;
            case 3:
                precioProducto = 9.98f;
                break;
            case 4:
                precioProducto = 4.49f;
                break;
            case 5:
                precioProducto = 6.87f;
                break;
            default:
                precioProducto = 0.00f;
                break;
        }
        
        totalVenta = cantidadProducto * precioProducto;
        
        System.out.println("El total de la venta es: " + totalVenta);
    }
}
