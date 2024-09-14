/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase10.ejemplo02.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        
        float nota, acumuladoNotas, promedio;
        int cantidadEstudiantes;
        
        nota = 1;
        acumuladoNotas = promedio = 0.0f;
        cantidadEstudiantes = 0;
        
        Scanner scan = new Scanner(System.in);
        
        while (nota > 0) {
            System.out.print("Ingrese una nota: ");
            nota = scan.nextFloat();
            if (nota > 0) {
                //cantidadEstudiantes = cantidadEstudiantes + 1;
                cantidadEstudiantes++;
                
                //acumuladoNotas = acumuladoNotas + nota;
                acumuladoNotas += nota;
            }
        }
        
        promedio = acumuladoNotas / cantidadEstudiantes;
        
        System.out.println("El promedio es: " + promedio);
    }
}
