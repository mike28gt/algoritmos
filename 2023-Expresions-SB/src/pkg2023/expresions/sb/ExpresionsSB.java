/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.expresions.sb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class ExpresionsSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 2;
        
        System.out.println(++i); // 3
        System.out.println(++i); // 4
        
        System.out.println(--i); // 3
        
        System.out.println(i++); // 3
        System.out.println(i);   // 4
        
        System.out.println(i--); // 4
        System.out.println(i);   // 3
        
        double resultado = (2.0 + 3.0) / (3.0 * 1.0);
        System.out.println(resultado);
        
        Scanner scan = new Scanner(System.in);
        
        int datoEntero = scan.nextInt();
        System.out.println(datoEntero);
        
        float datoFloat = scan.nextFloat();
        System.out.println(datoFloat);
        
        System.out.println("Hola mundo");
        
        System.out.println("El valor entero es: " + datoEntero);
        
        
    }
    
}
