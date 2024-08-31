/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase07.secciona;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class Clase07SeccionA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        float precioTraje = scan.nextFloat();
        
        float descuento = precioTraje * 0.15f;
        
        float precioConDescuento = precioTraje - descuento;
        
        System.out.println(descuento);
        System.out.println(precioConDescuento);
    }
    
}
