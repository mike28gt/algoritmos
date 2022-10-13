/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.se1.ejemploproyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        
        File etiquetasFile = new File("etiquetas.txt");
        File tareasFile = new File("tareas.txt");
        File copiaTareasFile = new File("copia_tareas.txt");
        
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
            
            //La entrada para eliminar etiquetas debe ser el código de etiqueta
            String codigoEtiquetaEliminar = "1";
            
            //Eliminación del código de la etiqueta del archivo de tareas
            
            //Paso 1: leer todas las tareas
            FileReader tareasFileReader = new FileReader(tareasFile);
            BufferedReader tareasBufferedReader = new BufferedReader(tareasFileReader);
            
            //Apertura del archivo que contendrá una copia de las tareas ya modificadas
            FileWriter copiaTareasFileWriter = new FileWriter(copiaTareasFile);
            BufferedWriter copiaTareasBufferedWriter = new BufferedWriter(copiaTareasFileWriter);
            
            String lineaArchivo = "";
            
            while ((lineaArchivo = tareasBufferedReader.readLine()) != null) {
                System.out.println(lineaArchivo);
                
                String[] datos = lineaArchivo.split("\\|");
                
                System.out.println("Codigo de Tarea: " + datos[0]);
                System.out.println("Nombre de Tarea: " + datos[1]);
                System.out.println("Etiquetas: " + datos[2]);
                
                // Paso 2: Determinar los valores de las etiquetas asignadas
                String[] etiquetas = datos[2].split(",");
                String nuevoListadoEtiquetas = "";
                
                for ( int i = 0; i < etiquetas.length; i++ ) {
                    System.out.println("Etiqueta " + i + ": " + etiquetas[i]);
                    
                    // Paso 3: Identificar si la etiqueta leída se debe eliminar
                    if (!etiquetas[i].equals(codigoEtiquetaEliminar)) {
                        if (nuevoListadoEtiquetas.isEmpty()) {
                            nuevoListadoEtiquetas = etiquetas[i];
                        } else {
                            nuevoListadoEtiquetas = nuevoListadoEtiquetas + "," + etiquetas[i];
                        }
                    }
                }
                
                datos[2] = nuevoListadoEtiquetas;

                System.out.println("Cualquier otro valor: " + datos[3]);
                
                lineaArchivo = String.join("|", datos);
                
                copiaTareasBufferedWriter.write(lineaArchivo);
                copiaTareasBufferedWriter.newLine();
            }
            
            tareasBufferedReader.close();
            copiaTareasBufferedWriter.close();
            
            copiaTareasFile.renameTo(tareasFile);
            
            // Eliminación de la etiqueta del archivo de etiquetas
            // Para hacer esto pueden utilizar la funcionalidad anterior.
            
            

            
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
