/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase09.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        
        float notaGt;
        char notaUs;
        
        Scanner scan = new Scanner(System.in);

// Programa para la versión 3 del pseudocódigo
        
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota en formato GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        else if (notaGt < 90 && notaGt >= 80) {
            notaUs = 'B';
        }
        else if (notaGt < 80 && notaGt >= 70) {
            notaUs = 'C';
        }
        else if (notaGt < 70 && notaGt >= 60) {
            notaUs = 'D';
        }
        else if (notaGt < 60) {
            notaUs = 'F';
        }
                     
        System.out.println("La nota en formato US es: " + notaUs);   
// Programa para la versión 2 del pseudocódigo
/*
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota en formato GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        else {
            if (notaGt < 90 && notaGt >= 80) {
                notaUs = 'B';
            }
            else {
                if (notaGt < 80 && notaGt >= 70) {
                    notaUs = 'C';
                }
                else {
                    if (notaGt < 70 && notaGt >= 60) {
                        notaUs = 'D';
                    }
                    else {
                        if (notaGt < 60) {
                            notaUs = 'F';
                        }
                    }
                }
            }
        }
                     
        System.out.println("La nota en formato US es: " + notaUs);   
*/

// Programa para la versión 1 del pseudocódigo
/*        
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota en formato GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        
        if (notaGt < 90 && notaGt >= 80) {
            notaUs = 'B';
        }
                
        if (notaGt < 80 && notaGt >= 70) {
            notaUs = 'C';
        }
                        
        if (notaGt < 70 && notaGt >= 60) {
            notaUs = 'D';
        }
                                
        if (notaGt < 60) {
            notaUs = 'F';
        }
                     
        System.out.println("La nota en formato US es: " + notaUs);
*/
    }
}
