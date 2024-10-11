/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.escrituradearchivos.sa;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class EscrituraDeArchivosSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        
        File f = new File("archivo_texto.txt");
        
        System.out.println("1. Escribir registro");
        System.out.println("2. Agregar registro");
        System.out.println("3. Leer registros");
        System.out.println("4. Actualizar registro");
        System.out.println("5. Eliminar registro");
        System.out.print("Seleccione operacion a realizar: ");
        opcion = scan.nextInt();
        
        switch (opcion) {
            case 1: 
                    try {
                        FileWriter fw = new FileWriter(f);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("123456|Miguel|Catalan|M|21|Ingeniería\n");
                        bw.write("234567|Jorge|Tepet|M|21|Ingeniería\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            case 2:
                    try {
                        FileWriter fw = new FileWriter(f, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("654321|Alejandro|López|M|22|Ingeniería\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

            case 3: 
                    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String linea = "";
                        while((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        } 
                        br.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            case 4:
                    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        FileWriter fw = new FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("123456") == 0) {
                                linea = "123456|Estela|González|F|21|Ingeniería";
                            }
                            
                            bw.write(linea+"\n");
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), f.toPath(), REPLACE_EXISTING);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    break;
            case 5: 
                    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        
                        File fc = new File("archivo_texto_copia.txt");
                        FileWriter fw = new FileWriter(fc);
                        BufferedWriter bw = new BufferedWriter(fw);
                        
                        String linea = "";
                        
                        while((linea = br.readLine()) != null) {
                            String [] datos = linea.split("\\|");
                            if (datos[0].compareTo("123456") != 0) {
                                bw.write(linea+"\n");
                            }
                        } 
                        
                        bw.close();
                        br.close();
                        
                        Files.move(fc.toPath(), f.toPath(), REPLACE_EXISTING);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(EscrituraDeArchivosSA.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    break;
            default: System.out.println("Ingrese una opción válida.");
        }
    }
    
}
