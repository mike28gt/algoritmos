/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.subalgoritmos.sa;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class SubalgoritmosSA {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int primerNumero = 0;
        int segundoNumero = 0;
        int resultado = 0;
        
        System.out.println("\t\tCalculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese la operación que desea realizar: ");
        opcion = scan.nextInt();
        
        switch(opcion) {
            case 1: System.out.print("Ingrese primer número: ");
                    primerNumero = scan.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    segundoNumero = scan.nextInt();
                    
                    resultado = primerNumero + segundoNumero;
                    
                    System.out.format("Resultado: %d\n", resultado);
                    break;
            case 2: System.out.print("Ingrese primer número: ");
                    primerNumero = scan.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    segundoNumero = scan.nextInt();
                    
                    resultado = primerNumero - segundoNumero;
                    
                    System.out.format("Resultado: %d\n", resultado);
                    break;
            case 3: System.out.print("Ingrese primer número: ");
                    primerNumero = scan.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    segundoNumero = scan.nextInt();
                    
                    resultado = primerNumero * segundoNumero;
                    
                    System.out.format("Resultado: %d\n", resultado);
                    break;
            case 4: System.out.print("Ingrese primer número: ");
                    primerNumero = scan.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    segundoNumero = scan.nextInt();
                    
                    resultado = primerNumero / segundoNumero;
                    
                    System.out.format("Resultado: %d\n", resultado);break;
            default: System.out.println("La opción seleccionada no es válida.");
        }
        
        /*
        SubalgoritmosSA obj = new SubalgoritmosSA();
        
        System.out.println("Sistema de  Votaciones");
        System.out.println("1. Acceso del Votante al Sistema.");
        System.out.println("2. ABC");
        System.out.println("N. XYZ");
        
        System.out.print("Seleccione una opción: ");
        int opcion = scan.nextInt();
        
        switch (opcion) {
            case 1: System.out.print("Ingrese correo electrónico: ");
                    String correoElectronico = scan.next();

                    System.out.print("Ingrese contraseña: ");
                    String psw = scan.next();
                    
                    boolean isValido = obj.accesoAlSistemaVotante(correoElectronico, psw);
                    
                    if (isValido) {
                        System.out.println("Ingrese CUI: ");
                        System.out.print("Bienvenido al sistema");
                    }
                   break;
            case 2: 
                    // otro bloque de código
                break;
                    // otro bloque de código
            case 'n': break;
            default :
        }
    }
    
    boolean accesoAlSistemaVotante (String correo, String contrasenia) {
        // Subproblema de Acceso del Votante al Sistema

        boolean accesoValido = false;
        
        if (correo.compareTo("admin@admin.admin") == 0) {
            if (contrasenia.compareTo("123$") == 0) {
                //System.out.println("Ingrese CUI: ");
                //System.out.print("Bienvenido al sistema");
                accesoValido = true;
            }
            else {
                System.err.println("Contraseña incorrecta.");
                accesoValido = false;
            }
        }
        else {
            System.err.println("Usuario incorrecto.");
            accesoValido = false;
        } 
        
        return accesoValido;
        */
    }
}
