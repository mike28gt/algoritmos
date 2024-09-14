/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase07.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class Clase07SeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float descuento = 0.0f;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese precio del traje: GTQ");
        float precioTraje = scan.nextFloat();
        
        if (precioTraje > 2500) {
            descuento = precioTraje * 0.15f;
        } else if (precioTraje == 1000) {
            descuento = precioTraje * 0.10f;
            if (true) {
            } else {
            }
        } else {
            descuento = precioTraje * 0.05f;
            if (true) {
            }
        }
        
        float precioConDescuento = precioTraje - descuento;
        
        System.out.format("El descuento del traje es de GTQ%.2f y el precio con descuento del traje es GTQ%.2f%n.", descuento, precioConDescuento);
    }
    
}
