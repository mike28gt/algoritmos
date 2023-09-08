/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.sentenciasrepetitivas.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class SentenciasRepetitivasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int edadPrimerEstudiante, edadSegundoEstudiante, edadTercerEstudiante, cantidadEstudiantes, sumatoriaEdades;
        float edadPromedio;
        
        System.out.print("Ingrese la edad del primer estudiante: ");
        edadPrimerEstudiante = scan.nextInt();
        cantidadEstudiantes = 1;
        System.out.print("Ingrese la edad del primer estudiante: ");
        edadSegundoEstudiante = scan.nextInt();
        cantidadEstudiantes = 2;
        System.out.print("Ingrese la edad del primer estudiante: ");
        edadTercerEstudiante = scan.nextInt();
        cantidadEstudiantes = 3;
        sumatoriaEdades = edadPrimerEstudiante + edadSegundoEstudiante + edadTercerEstudiante;
        edadPromedio = sumatoriaEdades / cantidadEstudiantes;
        System.out.println("La edad promedio de los estudiantes es de: " + edadPromedio);
    }
    
}
