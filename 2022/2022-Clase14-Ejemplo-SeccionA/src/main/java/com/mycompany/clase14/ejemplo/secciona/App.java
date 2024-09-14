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
        
        operacion = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.print("Ingrese la operación que desea realizar: ");
        
        operacion = scan.nextInt();
        
        switch (operacion) {
            case 1: suma();
                    break;
            case 2: resta();
                    break;
            case 3: //resultado = operandoUno * operandoDos;
                    break;
            case 4: //resultado = operandoUno / operandoDos;
                    break;
        }
    }
    
    //Aquí creamos los nuevos métodos
    public static void suma() {
        float operandoUno, operandoDos, resultado;
        
        operandoUno = operandoDos = resultado = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el primero operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese el segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno + operandoDos;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void resta() {
        float operandoUno, operandoDos, resultado;
        
        operandoUno = operandoDos = resultado = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el primero operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese el segundo operando: ");
        operandoDos = scan.nextFloat();
        
        resultado = operandoUno - operandoDos;
        
        System.out.println("El resultado de la resta es: " + resultado);
    }
}
