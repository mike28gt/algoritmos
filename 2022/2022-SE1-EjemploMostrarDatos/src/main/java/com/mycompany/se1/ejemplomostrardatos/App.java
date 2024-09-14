/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.se1.ejemplomostrardatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        // Como desplegar los nombres de las etiquetas al mostrar los datos 
        // de las tareas.
        
        File etiquetasFile = new File("etiquetas.txt");
        File tareasFile = new File("tareas.txt");
        
        try {
            // Escritura de archivos
            FileWriter etiquetasFileWriter = new FileWriter(etiquetasFile);
            BufferedWriter etiquetasBufferedWriter = new BufferedWriter(etiquetasFileWriter);
            
            etiquetasBufferedWriter.write("1|Etiqueta 1");
            etiquetasBufferedWriter.newLine();
            etiquetasBufferedWriter.write("2|Etiqueta 2");
            etiquetasBufferedWriter.newLine();
            
            etiquetasBufferedWriter.close();
            
            FileWriter tareasFileWriter = new FileWriter(tareasFile);
            BufferedWriter tareasBufferedWriter = new BufferedWriter(tareasFileWriter);
            
            // Supongamos que la estructura del archivo es:
            // Codigo de Tarea|Nombre de Tarea|Etiquetas
            tareasBufferedWriter.write("1|Tarea 1|1|otro valor");
            tareasBufferedWriter.newLine();
            tareasBufferedWriter.write("2|Tarea 2|1,2|otro valor");
            tareasBufferedWriter.newLine();
            tareasBufferedWriter.write("3|Tarea 3||otro valor");
            tareasBufferedWriter.newLine();
            
            tareasBufferedWriter.close();
            
            //Paso 1: leer todas las tareas
            FileReader tareasFileReader = new FileReader(tareasFile);
            BufferedReader tareasBufferedReader = new BufferedReader(tareasFileReader);
            
            String lineaArchivo = "";
            String lineaArchivoEtiquetas = "";
            
            while ((lineaArchivo = tareasBufferedReader.readLine()) != null) {
                System.out.println(lineaArchivo);
                
                String[] datos = lineaArchivo.split("\\|");
                
                System.out.println("Codigo de Tarea: " + datos[0]);
                System.out.println("Nombre de Tarea: " + datos[1]);
                //System.out.println("Etiquetas: " + datos[2]);
                
                // Paso 2: Determinar los valores de las etiquetas asignadas
                String[] etiquetas = datos[2].split(",");
                
                for ( int i = 0; i < etiquetas.length; i++ ) {
                    //System.out.println("Etiqueta " + i + ": " + etiquetas[i]);
                     
                    lineaArchivoEtiquetas = "";
                    
                    FileReader etiquetasFileReader = new FileReader(etiquetasFile);
                    BufferedReader etiquetasBufferedReader = new BufferedReader(etiquetasFileReader);
                    
                    while ((lineaArchivoEtiquetas = etiquetasBufferedReader.readLine()) != null) {
                        String[] datosEtiquetas = lineaArchivoEtiquetas.split("\\|");
                        
                        if (etiquetas[i].equals(datosEtiquetas[0])) {
                            System.out.println("Nombre Etiqueta: " + datosEtiquetas[1]);
                            break;
                        }
                    }
                    
                    etiquetasBufferedReader.close();
                }
                
                System.out.println("Cualquier otro valor: " + datos[3]);                
            }
            
            tareasBufferedReader.close();
            
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
