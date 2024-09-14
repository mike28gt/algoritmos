/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.sentenciasselectivas.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class SentenciasSelectivasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float precioTraje = 0.0f;
        float descuento = 0.0f;
        float precioTrajeConDescuento = 0.0f;
        
        System.out.println("Ingrese precio del traje: ");
        precioTraje = scan.nextFloat();
        
        if (precioTraje > 2500) {
            descuento = precioTraje * 0.15f;
            precioTrajeConDescuento = precioTraje - descuento;
        }
        else if (precioTraje == 1000) {
            descuento = precioTraje * 0.10f;
            precioTrajeConDescuento = precioTraje - descuento;
        }
        else {
            descuento = precioTraje * 0.05f;
            precioTrajeConDescuento = precioTraje - descuento;
        }
        
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El precio del traje con descuento es:" + precioTrajeConDescuento);
    
    
        // Otro tipo de condicional.
        // No esta relacionado con el ejemplo anterior
        
        int dia = 1;
        
        if (dia == 1) {
            System.out.println("Domingo");
        }
        else if (dia == 2) {
            System.out.println("Lunes");
        }
        
        switch (dia) {
            case 1: System.out.println("Domingo");
                    break;
            case 2: System.out.println("Lunes");
                    break;
            case 3: System.out.println("Martes");
                    break;
            case 4: System.out.println("Miercoles");
                    break;
            case 5: System.out.println("Jueves");
                    break;
            case 6: System.out.println("Viernes");
                    break;
            case 7: System.out.println("Sabado");
                    break;
            default: System.out.println("Ingrese un día válido.");
                    break;
        }
        
    }
}
