/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase08.estructurasrepetitivas.sa;

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
        float edadPromedio = 0.0f;
        int edadEstudiante = 0;
        int cantidadEstudiantes = 0;
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = scan.nextInt();
        
        for (contadorEstudiantes = 0; 
             contadorEstudiantes < cantidadEstudiantes;
             contadorEstudiantes = contadorEstudiantes + 1) {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            if (edadEstudiante == 0)
                    break;
            acumuladorEdades = acumuladorEdades + edadEstudiante;
        }
        
        edadPromedio = acumuladorEdades / contadorEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
        
        
        /*
        Scanner scan = new Scanner(System.in);
        int acumuladorEdades = 0;
        int contadorEstudiantes = 0;
        float edadPromedio = 0.0f;
        int edadEstudiante = 0;

        do  {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            
            acumuladorEdades = acumuladorEdades + edadEstudiante;
            contadorEstudiantes = contadorEstudiantes + 1;
            
        } while (edadEstudiante > 0);
        
        edadPromedio = acumuladorEdades / contadorEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
        
        */
        /*
        Scanner scan = new Scanner(System.in);
        int acumuladorEdades = 0;
        int contadorEstudiantes = 0;
        float edadPromedio = 0.0f;
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scan.nextInt();
        
        while (edadEstudiante > 0) {
            acumuladorEdades = acumuladorEdades + edadEstudiante;
            contadorEstudiantes = contadorEstudiantes + 1;
            
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
        }
        
        if (contadorEstudiantes != 0) {
            edadPromedio = acumuladorEdades / contadorEstudiantes;
        }
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
        */
        
        /*
        Scanner scan = new Scanner(System.in);
        int acumuladorEdades = 0;
        int contadorEstudiantes = 0;
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante1 = scan.nextInt();
        
        acumuladorEdades = acumuladorEdades + edadEstudiante1;
        contadorEstudiantes = contadorEstudiantes + 1;
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante2 = scan.nextInt();
        
        acumuladorEdades = acumuladorEdades + edadEstudiante2;
        contadorEstudiantes = contadorEstudiantes + 1;
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante3 = scan.nextInt();
        
        acumuladorEdades = acumuladorEdades + edadEstudiante3;
        contadorEstudiantes = contadorEstudiantes + 1;
        
        float edadPromedio = acumuladorEdades / contadorEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
        */
    }
    
}
