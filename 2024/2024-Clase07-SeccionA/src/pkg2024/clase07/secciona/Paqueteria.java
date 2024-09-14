/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase07.secciona;

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
        
        int zonaEntrega = scan.nextInt();
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
                    break;
            }
            
            totalAPagar = pesoEnKilogramos * tarifa;
            
            System.out.println(totalAPagar);
        }
    }
    
}
