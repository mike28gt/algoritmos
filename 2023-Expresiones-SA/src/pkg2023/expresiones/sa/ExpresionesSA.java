/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.expresiones.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class ExpresionesSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 3;
        
        System.out.println(++i); // 4
        System.out.println(++i); // 5
        
        System.out.println(--i); // 4
        
        System.out.println(i++); // 4
        System.out.println(i);   // 5
        
        System.out.println(i--); // 
        System.out.println(i);
        
        Scanner scan = new Scanner(System.in);
        
        
        int datoEntero = scan.nextInt();
        System.out.println(datoEntero);
        
        float datoFlotante = scan.nextFloat();
        System.out.println(datoFlotante);
        
        boolean datoBooleano = scan.nextBoolean();
        System.out.println(datoBooleano);
        
        String datoCadena = scan.next();
        System.out.println(datoCadena);
        
        System.out.println("Hola mundo");
        
        System.out.println("El dato entero es: " + datoEntero);
        
    }
    
}
