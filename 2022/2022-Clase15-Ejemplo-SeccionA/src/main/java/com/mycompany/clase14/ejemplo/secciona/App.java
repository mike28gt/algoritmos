/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase14.ejemplo.secciona;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {

        int operacion;
        float numeroUno, numeroDos, res;
        
        operacion = 0;
        numeroUno = numeroDos = res = 0.0f;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.print("Ingrese la operación que desea realizar: ");
        
        operacion = scan.nextInt();

        System.out.print("Ingrese el primer operando: ");
        numeroUno = scan.nextFloat();
        
        System.out.print("Ingrese el segundo operando: ");
        numeroDos = scan.nextFloat();
        
        switch (operacion) {
            case 1: res = suma(numeroUno, numeroDos);
                    break;
            case 2: res = resta(numeroUno, numeroDos);
                    break;
            case 3: //resultado = operandoUno * operandoDos;
                    break;
            case 4: //resultado = operandoUno / operandoDos;
                    break;
        }
        
        System.out.println("El resultado de la operación es: " + res);
    }
    
    //Aquí creamos los nuevos métodos
    //Parámetros
    public static float suma(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno + operandoDos;
        
        return resultado;
    }
    
    public static float resta(float operandoUno, float operandoDos) {
        float resultado;
        
        resultado = 0.0f;
        
        resultado = operandoUno - operandoDos;
        
        return resultado;
    }
}
