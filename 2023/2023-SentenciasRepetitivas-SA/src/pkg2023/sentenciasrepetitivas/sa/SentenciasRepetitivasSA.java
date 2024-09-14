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
        int conteoEstudiantes = 0, edadEstudiante = -1, cantidadEstudiantes = 0, sumatoriaEdades = 0;
        float edadPromedio = 0.0f;
        
        System.out.println("Para detener el ingreso de estudiantes ingrese 0: ");
        //cantidadEstudiantes = scan.nextInt();
        /*
        while (conteoEstudiantes < cantidadEstudiantes) {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            conteoEstudiantes = conteoEstudiantes + 1;
            sumatoriaEdades = sumatoriaEdades + edadEstudiante;
        }
        */
        
        //    contador                   condicion                              incremento contador
        /*
        for (conteoEstudiantes = 0; 
             conteoEstudiantes < cantidadEstudiantes; 
             conteoEstudiantes = conteoEstudiantes + 1) {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            sumatoriaEdades = sumatoriaEdades + edadEstudiante;
        }
        */
        
        
        while (edadEstudiante != 0) {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            conteoEstudiantes = conteoEstudiantes + 1;
            sumatoriaEdades = sumatoriaEdades + edadEstudiante;
            if (edadEstudiante == 10)
                continue;
            System.out.println("Esto esta despues del continue...");
        }
        
        
        /*
        do {
            System.out.print("Ingrese la edad del estudiante: ");
            edadEstudiante = scan.nextInt();
            conteoEstudiantes = conteoEstudiantes + 1;
            sumatoriaEdades = sumatoriaEdades + edadEstudiante;
        } while (edadEstudiante != 0);
        */
        

        edadPromedio = sumatoriaEdades / conteoEstudiantes;
        System.out.println("La edad promedio de los estudiantes es de: " + edadPromedio);
    }
    
}
