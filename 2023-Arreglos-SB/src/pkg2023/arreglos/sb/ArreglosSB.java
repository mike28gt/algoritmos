/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.arreglos.sb;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author miguelcatalan
 */
public class ArreglosSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Vectores
        // Creación de vectores
        int [] b = {1, 3, 5, 7, 9, 11};
        int a = 2;
        int suma = b[2] + 10;
        
        a = 10;
        b[2] = 0;
        
        //int tamanio = 10;
        int [] c = new int[5];
        
        // Asignación de datos al vector
        b[2] = 0;
        c[1] = 101;
        
        // Recorrer un vector
        //int i = i + 1;
        //i += 1;
        //i++;
        
        for (int i = 0; i < c.length; i++) {
            //System.out.println(i);
            c[i] = 0;
        }
        
        //Instrucción for mejorada
        // for (tipo_dato variable : nombreVector) { }
        for (int elemento : c) {
            //System.out.println(elemento);
        } 
        
        //Matrices
        // Creación de arreglos bidimensionales
        int [][] z = {{1,3}, {5,7}, {9, 11}};
        int [][] x = new int[2][2];

        // Asignación de datos a las matrices
        x[0][1] = 199;
        x[1][0] = 200;
        
        // Recorrer una matriz
        for (int k = 0; k < x.length; k++) {
            //System.out.println(Arrays.toString(x[k]));
            for (int l = 0; l < x[k].length; l++) {
                //System.out.println(x[k][l]);
            }
        }
        
        //Arrays
        int [] y = {5, 22, 69, 45 ,50};
        // Arrays.sort
        System.out.println(Arrays.toString(y));
        Arrays.sort(y);
        System.out.println(Arrays.toString(y)); 
        // Arrays.fill
        int [] t = new int[5];
        System.out.println(Arrays.toString(t)); 
        Arrays.fill(t, -1);
        System.out.println(Arrays.toString(t)); 
        // Arrays.equals
        int [] w = {-1,-1,0,-1,-1};
        System.out.println(Arrays.equals(t, w));
        // Arrays.binarySearch
        System.out.println(Arrays.binarySearch(y, 69));
        
        
        //ArrayList
        ArrayList r = new ArrayList();
        // add
        r.add(1);
        // clear
        // contains
        // get
        // indexOf
        // remove
        // size
            
        
    }
    
}
