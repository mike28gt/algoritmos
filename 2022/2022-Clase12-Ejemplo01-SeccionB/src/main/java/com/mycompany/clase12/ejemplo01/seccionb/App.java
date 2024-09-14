/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase12.ejemplo01.seccionb;

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
        
        File fileObj = new File("archivo_prueba.txt");
        
        try {
            // Escritura de archivos
            FileWriter fileWriterObj = new FileWriter(fileObj);
            BufferedWriter bufferedWriterObj = new BufferedWriter(fileWriterObj);
            
            Scanner scan = new Scanner(System.in);
            String codigo, nombre, apellido, edad;
            codigo = nombre = apellido = edad = "";
            
            System.out.print("Ingrese código: ");
            codigo = scan.nextLine();
            System.out.print("Ingrese nombre: ");
            nombre = scan.nextLine();
            System.out.print("Ingrese apellido: ");
            apellido = scan.nextLine();
            System.out.print("Ingrese edad: ");
            edad = scan.nextLine();
            
            String lineaAEscribir = codigo + "|" + nombre + "|" + apellido + "|" + edad;
            
            bufferedWriterObj.write(lineaAEscribir);
            
            /*
            bufferedWriterObj.write("1|Miguel|Catalan|25");
            bufferedWriterObj.newLine();
            bufferedWriterObj.write("2|Erick|Ramirez|20");
            bufferedWriterObj.newLine();
            bufferedWriterObj.write("3|Lidia|Patzan|20");
            bufferedWriterObj.newLine();
            */
            
            bufferedWriterObj.close();
            
            // Lectura de archivos
            FileReader fileReaderObj = new FileReader(fileObj);
            BufferedReader bufferedReaderObj = new BufferedReader(fileReaderObj);
            
            String lineaArchivo = "";
            
            while ((lineaArchivo = bufferedReaderObj.readLine()) != null) {
                System.out.println(lineaArchivo);
                
                String[] datos = lineaArchivo.split("\\|");
                
                System.out.println("Código: " + datos[0]);
                System.out.println("Nombre: " + datos[1]);
                System.out.println("Apellido: " + datos[2]);
                System.out.println("Edad: " + datos[3]);
                
                /**
                 * lineaArchivo = "1|Miguel|Catalan|25";
                 * lineaArchivo.split("|");
                 *              1
                 *              Miguel
                 *              Catalan
                 *              25
                 **/
            }
            
            bufferedReaderObj.close();
            
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
