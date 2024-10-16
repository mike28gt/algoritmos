/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.arreglos.sa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        String [][] datosEstudiantes = new String[75][6];
        File f = new File("registros.txt");
        
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String [] campos = linea.split("\\|");
                datosEstudiantes[contador][0] = campos[0];
                datosEstudiantes[contador][1] = campos[1];
                datosEstudiantes[contador][2] = campos[2];
                datosEstudiantes[contador][3] = campos[3];
                datosEstudiantes[contador][4] = campos[4];
                datosEstudiantes[contador][5] = campos[5];
                contador++;
            }
            
            br.close();
            fr.close();
            
            Scanner scan = new Scanner(System.in);
            String codigo;
            
            System.out.print("Ingrese el código a buscar:");
            codigo = scan.nextLine();
            contador = 0;
            int indiceModificado = 0;
            
            while (datosEstudiantes.length > contador) {
                if (datosEstudiantes[contador][0] != null &&
                    datosEstudiantes[contador][0].compareTo(codigo) == 0) {
                    for (int i = 0; 
                             i<datosEstudiantes[contador].length; 
                             i++) {
                        System.out.print(datosEstudiantes[contador][i] + " ");
                    }
                    
                    String nombre;
                    System.out.println("Ingrese el nuevo nombre:");
                    nombre = scan.nextLine();
                    
                    datosEstudiantes[contador][1] = nombre;
                    indiceModificado = contador;
                }
                contador++;
            }
          
            
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            
            contador = 0;
            while (datosEstudiantes[contador][0] != null) {
                bw.write(datosEstudiantes[contador][0] + "|" + 
                        datosEstudiantes[contador][1] + "|" +
                        datosEstudiantes[contador][2] + "|" +
                        datosEstudiantes[contador][3] + "|" +
                        datosEstudiantes[contador][4] + "|" +
                        datosEstudiantes[contador][5] + "\n");
                contador++;
            }
            
            bw.close();
            fw.close();
            /*
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
            */
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArreglosSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArreglosSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
