/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase09.secciona;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

//Traducción de la tercera versión del pseudocódigo
        float notaGt;
        char notaUs;
        
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota con la ponderación GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        else if (notaGt <= 89 && notaGt >= 80) {
            notaUs = 'B';
        }
        else if (notaGt <= 79 && notaGt >= 70) {
            notaUs = 'C';
        }
        else if (notaGt <= 69 && notaGt >= 60) {
            notaUs = 'D';
        }
        else if (notaGt < 60) {
            notaUs = 'F';
        }
        
        System.out.println("La nota en ponderación US es: " + notaUs);
        
//Traducción de la segunda versión del pseudocódigo     
/*
        float notaGt;
        char notaUs;
        
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota con la ponderación GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        else {
            if (notaGt <= 89 && notaGt >= 80) {
                notaUs = 'B';
            }
            else {
                if (notaGt <= 79 && notaGt >= 70) {
                    notaUs = 'C';
                }
                else {
                    if (notaGt <= 69 && notaGt >= 60) {
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
        
        System.out.println("La nota en ponderación US es: " + notaUs);
*/


//Traducción de la primer versión del pseudocódigo     
/* 
        float notaGt;
        char notaUs;
        
        notaGt = 0.0f;
        notaUs = ' ';
        
        System.out.println("Ingrese la nota con la ponderación GT: ");
        notaGt = scan.nextFloat();
        
        if (notaGt <= 100 && notaGt >= 90) {
            notaUs = 'A';
        }
        
        if (notaGt <= 89 && notaGt >= 80) {
            notaUs = 'B';
        }
                
        if (notaGt <= 79 && notaGt >= 70) {
            notaUs = 'C';
        }
                        
        if (notaGt <= 69 && notaGt >= 60) {
            notaUs = 'D';
        }
                                
        if (notaGt < 60) {
            notaUs = 'F';
        }
        
        System.out.println("La nota en ponderación US es: " + notaUs);
*/
    }
}
