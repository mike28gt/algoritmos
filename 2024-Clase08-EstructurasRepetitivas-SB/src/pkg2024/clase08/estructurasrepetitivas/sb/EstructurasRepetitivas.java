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
    }
    
}
