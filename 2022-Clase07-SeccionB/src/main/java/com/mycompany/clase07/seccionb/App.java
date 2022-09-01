/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase07.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        /*Operadores Unarios*/
        int negativo = -(-2);
        
        int numero = 1;
        
        /*Operador de Pre Incremento
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero);
        */
        
        /*Operador de Post Incremento
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        */
        
        /*Operador de Pre Decremento
        System.out.println(numero);
        System.out.println(--numero);
        System.out.println(numero);
        */
        
        /*Operador de Post Decremento
        System.out.println(numero);
        System.out.println(numero--);
        System.out.println(numero);
        */
        
        /*Operadores aritmeticos*/
        int suma = 3 + 2;
        int resta = 4 - 1;
        int multiplicacion = 7 * 8;
        double division = 7.0/9;
        int residuo = 4 % 2;
        double expresion = (3.0 + 2.0) / (5.0 * 8.0);
        
        /*Operadores relacionales*/
        boolean mayorQue = 2 > 3;
        boolean mayorOIgualQue = 2 >= 2;
        boolean menorQue = 5 < -2;
        boolean menorOIgualQue = 5 <= 5;
        boolean igualQue =  7 == 6;
        boolean diferenteQue =  98 != 98;
        
        /*Operadores lógicos*/
        boolean and = true && true;
        boolean or = false || false;
        boolean not = !true;
    }
}
