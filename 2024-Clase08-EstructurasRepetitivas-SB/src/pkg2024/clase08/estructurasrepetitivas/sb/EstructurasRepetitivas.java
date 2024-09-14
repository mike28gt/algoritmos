/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase08.estructurasrepetitivas.sb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class EstructurasRepetitivas {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumuladorEdades = 0;
        int contadorEstudiantes = 0;
        int edadEstudiante = 0;
        
        do {
            
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            
            if (edadEstudiante > 0) {
                acumuladorEdades = acumuladorEdades + edadEstudiante;
                contadorEstudiantes = contadorEstudiantes + 1;
            }
            
        } while (edadEstudiante > 0);
        
        float edadPromedio = acumuladorEdades / contadorEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
    }
        
        /*
        Scanner scan = new Scanner(System.in);
        int acumuladorEdades = 0;
        int contadorEstudiantes = 0;
        int edadEstudiante = 1;
        
        while (edadEstudiante > 0) {
            
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            
            if (edadEstudiante > 0) {
                acumuladorEdades = acumuladorEdades + edadEstudiante;
                contadorEstudiantes = contadorEstudiantes + 1;
            }
        }
        
        float edadPromedio = acumuladorEdades / contadorEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
       
    }
    */
}
