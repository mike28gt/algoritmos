/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clase05.secciona;

/**
 *
 * @author miguelcatalan
 */
public class Clase05SeccionA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "   Bienvenido al curso de algoritmos   ";
        String nombrePersona = "Miguel";
        
        String concatenacion = cadena + nombrePersona;
        
        int longitudCadena = nombrePersona.length();
        
        char caracter = nombrePersona.charAt(2);
        
        int indiceCaracter = nombrePersona.indexOf('M');
        
        String subcadena = nombrePersona.substring(4, 6);
        
        String nombreMayusculas = nombrePersona.toUpperCase();
        
        String nombreMinusculas = nombrePersona.toLowerCase();
        
        System.out.println(concatenacion);
        System.out.println(longitudCadena);
        System.out.println(caracter);
        System.out.println(indiceCaracter);
        System.out.println(subcadena);
        System.out.println(nombreMayusculas);
        System.out.println(nombreMinusculas);
       
    }   
    
   
}
