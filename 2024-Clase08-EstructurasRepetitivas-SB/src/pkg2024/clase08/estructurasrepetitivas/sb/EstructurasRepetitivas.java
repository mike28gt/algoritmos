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
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante1 = scan.nextInt();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante2 = scan.nextInt();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante3 = scan.nextInt();
        
        int sumatoriaEdades = edadEstudiante1 + edadEstudiante2 + edadEstudiante3;
        int cantidadEstudiantes = 3;
        
        float edadPromedio = sumatoriaEdades / cantidadEstudiantes;
        
        System.out.format("La edad promedio de los estudiantes es de %.2f \n", edadPromedio);
    
    }
    
}
