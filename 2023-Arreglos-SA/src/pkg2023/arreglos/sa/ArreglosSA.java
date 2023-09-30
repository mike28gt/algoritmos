/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.arreglos.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class ArreglosSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Vectores
        // Creación de vectores
        int [] a = {1, 3, 5, 7, 9};
        int b = 9;
        int suma = b + 10;
        suma = a[2] + 10;
        b = 10;
        a[3] = 0;
        
        // Creación de vectores vacíos
        int [] c = new int[10];
        c[0] = 100;
        c[7] = 101;
        
        // Asignación de datos al vector
        a[3] = 0;
        c[0] = 100;
        c[7] = 101;
        
        // Recorrer un vector
        //int i = 0;
        //i = i + 1;
        //i += 1;
        //i++;
        
        Scanner scan = new Scanner(System.in);
        
        
        for (int i = 0; i < c.length ; i++) {
            System.out.println("Ingrese edad de la persona:");
            c[i] = scan.nextInt();
        }
            
            int j = 0;
            System.out.println("Ingrese edad de la persona:");
            c[j++] = scan.nextInt();
            
            System.out.println("Ingrese edad de la persona:");
            c[j++] = scan.nextInt();
            
            System.out.println(c[2 + 1]);
        
        
        //Instrucción for mejorada
        // for (tipo_dato variable : nombreVector) { }
        for (int variable : c) {
            System.out.println(variable);
        }
        
        
        //Matrices
        // Creación de arreglos bidimensionales
        int [][] z = {{1, 3}, {5, 7}, {9, 11}};
        int [][] x = new int[2][3];
        
        // Asignación de datos a las matrices
        x[1][2] = 199;
        x[0][1] = 200;
        
        // Recorrer una matriz
        for (int k = 0; k < z.length; k++) {
            for (int l = 0; l < z[k].length; l++) {
                System.out.println(z[k][l]);
            }
        }
        
        //Arrays
        // Arrays.sort
        // Arrays.fill
        // Arrays.equals
        // Arrays.binarySearch
        
        //ArrayList
        // add
        // clear
        // contains
        // get
        // indexOf
        // remove
        // size
            
        
    }
    
}
