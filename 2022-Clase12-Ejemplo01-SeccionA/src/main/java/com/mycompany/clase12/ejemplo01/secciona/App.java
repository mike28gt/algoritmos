/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase12.ejemplo01.secciona;

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
        File archivo = new File("prueba.txt");
        
        try {
            // Escritura en archivos
            FileWriter fileWriterObj = new FileWriter(archivo);
            BufferedWriter bufferedWriterObj = new BufferedWriter(fileWriterObj);
            
            bufferedWriterObj.write("1|Miguel|Catalan|25");
            bufferedWriterObj.newLine();
            bufferedWriterObj.write("2|Jorge|Tepet|20");
            bufferedWriterObj.newLine();
            bufferedWriterObj.write("3|Jackeline|Sanchez|20");
            bufferedWriterObj.newLine();
            
            bufferedWriterObj.close();
            
            
            // Lectura en archivos
            FileReader fileReaderObj = new FileReader(archivo);
            BufferedReader bufferedReaderObj = new BufferedReader(fileReaderObj);
            
            String lineaDelArchivo = "";
            
            while ((lineaDelArchivo = bufferedReaderObj.readLine()) != null) {
                System.out.println(lineaDelArchivo);
                String[] datos = lineaDelArchivo.split("\\|");
                
                System.out.println("Codigo " + datos[0]);
                System.out.println("Nombre " + datos[1]);
                System.out.println("Apellido " + datos[2]);
                System.out.println("Edad " + datos[3]);
                
                /*
                 * lineaDelArchivo = "1|Miguel|Catalan|25"
                 * lineaDelArchivo.split("\\|");
                 *              1
                 *              Miguel
                 *              Catalan
                 *              25
                 */
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
