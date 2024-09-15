/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase07.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class Paqueteria {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        float tarifa = 0.0f;
        float totalAPagar = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese zona de entrega: ");
        int zonaEntrega = scan.nextInt();
        
        System.out.print("Ingrese peso de paquete (g): ");
        float pesoPaquete = scan.nextFloat();
        
        float pesoEnKilogramos = pesoPaquete / 1000;
        
        if (pesoEnKilogramos <= 5) {
            switch (zonaEntrega) {
                case 1:
                    tarifa = 11.00f;
                    break;
                case 2:
                    tarifa = 10.00f;
                    break;
                case 3:
                    tarifa = 12.00f;
                    break;
                case 4:
                    tarifa = 24.00f;
                    break;
                case 5:
                    tarifa = 27.00f;
                    break;
                default:
                    System.err.print("La zona ingresada no es válida.\n");
                    break;
            }
            
            totalAPagar = pesoEnKilogramos * tarifa;
            
            System.out.format("El total a pagar por el paquete de %.2f kg a la zona %d es de GTQ %.2f%n", pesoEnKilogramos, zonaEntrega, totalAPagar);
        }
        
        
        
        /*
        float tarifa = 0.0f;
        float totalAPagar = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese zona de entrega: ");
        int zonaEntrega = scan.nextInt();
        
        System.out.print("Ingrese peso de paquete (g): ");
        float pesoPaquete = scan.nextFloat();
        
        float pesoEnKilogramos = pesoPaquete / 1000;
        
        if (pesoEnKilogramos <= 5) {
            if (zonaEntrega == 1) {
                tarifa = 11.00f;
            }
            else if (zonaEntrega == 2) {
                tarifa = 10.00f;
            }
            else if (zonaEntrega == 3) {
                tarifa = 12.00f;
            }
            else if (zonaEntrega == 4) {
                tarifa = 24.00f;
            }
            else if (zonaEntrega == 5) {
                tarifa = 27.00f;
            }
            
            totalAPagar = pesoEnKilogramos * tarifa;
            
            System.out.format("El total a pagar por el paquete de %.2f kg a la zona %d es de GTQ %.2f%n", pesoEnKilogramos, zonaEntrega, totalAPagar);
        }
        */
    }
    
}
