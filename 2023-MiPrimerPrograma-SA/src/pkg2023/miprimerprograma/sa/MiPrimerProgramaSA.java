/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.miprimerprograma.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class MiPrimerProgramaSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int dias = 0;
        float precioHotelDia = 0.0f;
        float precioAlimentacionDia = 0.0f;
        float montoHotel = 0.0f;
        float montoAlimentacion = 0.0f;
        float montoOtrosGastos = 0.0f;
        float montoTotalCheque = 0.0f;
        
        System.out.print("Ingrese cantidad de días: ");
        dias = scan.nextInt();
        System.out.print("Ingrese precio del hotel por día: ");
        precioHotelDia = scan.nextFloat();
        System.out.print("Ingrese precio de la alimentación por día: ");
        precioAlimentacionDia = scan.nextFloat();
        
        montoHotel = dias * precioHotelDia;
        montoAlimentacion = dias * precioAlimentacionDia;
        montoOtrosGastos = dias * 100;;
        montoTotalCheque = montoHotel + montoAlimentacion + montoOtrosGastos;
        
        System.out.println("El monto total de hotel es: " + montoHotel);
        System.out.println("El monto total de alimentación es: " + montoAlimentacion);
        System.out.println("El monto total de otros gastos es: " + montoOtrosGastos);
        System.out.println("El monto total del cheque es: " + montoTotalCheque);
    }
    
}
