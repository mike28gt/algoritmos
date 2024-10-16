/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.arreglos.sb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        File f = new File("registros.txt");
        
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String [][] datosEstudiantes = new String[75][6];
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
            

            //System.out.println(datosEstudiantes[10][1] + " " +
            //                   datosEstudiantes[10][2]);
            
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Ingrese código a buscar: ");
            String codigo = scan.nextLine();
            int indiceAModificar = -1;
            for (int i = 0; i < datosEstudiantes.length; i++) {
                
                if (datosEstudiantes[i][0] != null &&
                    datosEstudiantes[i][0].compareTo(codigo) == 0) {
                    System.out.println(datosEstudiantes[i][1] + " " +
                                       datosEstudiantes[i][2]);
                    indiceAModificar = i;
                }
                
                //System.out.println(datosEstudiantes[i][0]);
            }
            
            System.out.print("Ingrese el nuevo nombre: ");
            String nuevoNombre = scan.nextLine();
            
            datosEstudiantes[indiceAModificar][1] = nuevoNombre;
            
            System.out.println(datosEstudiantes[indiceAModificar][1] + " " +
                               datosEstudiantes[indiceAModificar][2]);
            
            contador = 0;
            
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while (datosEstudiantes[contador][0] != null &&
                   contador < datosEstudiantes.length) {
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
            */
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArreglosSB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArreglosSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
