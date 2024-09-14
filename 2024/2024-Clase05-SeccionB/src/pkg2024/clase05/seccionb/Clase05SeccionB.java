/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clase05.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class Clase05SeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = "  Bienvenido al curso de algoritmos    ";
        String nombre = "Miguel";
        
        String concatenacion = cadena + nombre;
        
        int longitud = nombre.length();
        char caracter = nombre.charAt(5);
        int indice = nombre.indexOf('M');
        String subcadena = nombre.substring(0, 2);
        String nombreMayuscula = nombre.toUpperCase();
        String nombreMinuscula = nombreMayuscula.toLowerCase();
        
        
        System.out.println(concatenacion);
        System.out.println(longitud);
        System.out.println(caracter);
        System.out.println(indice);
        System.out.println(subcadena);
        System.out.println(nombreMayuscula);
        System.out.println(nombreMinuscula);
    }
    
}
