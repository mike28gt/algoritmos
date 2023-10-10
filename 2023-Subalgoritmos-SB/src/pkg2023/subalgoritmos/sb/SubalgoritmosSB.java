/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.subalgoritmos.sb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class SubalgoritmosSB {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        SubalgoritmosSB obj = new SubalgoritmosSB();
        
        
        System.out.println("Sistema de Votaciones");
        
        System.out.println("Menu");
        System.out.println("1. Configuración inicial del sistema");
        System.out.println("2. ABC");
        System.out.println("N. XYZ");
        
        System.out.print("Seleccione una opción: ");
        int opcion = scan.nextInt();
        
        switch (opcion) {
            case 1: String contraseniaAdmin = "SistemaVotaciones2023";
                    String contrasenia;
                    
                    System.out.print("Ingrese una contraseña para el usuario admin: ");
                    contrasenia = scan.next();
                
                    boolean var = obj.configuracionInicialDelSistema(contraseniaAdmin, contrasenia);
            
                    if (var) {
                        System.out.println("Ingreso exitoso al sistema.");
                    } else {
                        System.err.println("No se pudo acceder al sistema.");
                    }
            
                    break;
            case 2: break;
            case 'N' : break;
            default: 
        }
    }

    boolean configuracionInicialDelSistema (String contraseniaAdmonUno, String contraseniaAdmon) {
        
        Scanner scan = new Scanner(System.in);

        boolean isValid;
        
        do {        
            
              if (contraseniaAdmonUno.compareTo(contraseniaAdmon) == 0) {
                  //System.out.println("La contraseña es correcta");
                  //System.out.println("Inicio de sesión es exitoso");
                  isValid = true;
              } 
              else {
                  //System.err.println("La contraseña es incorrecta");
                  //System.out.println("Ingrese la contraseña de nuevo");
                  isValid = false;
              }

          } while (contraseniaAdmonUno.compareTo(contraseniaAdmon) != 0);
        
        return isValid;
    }
}
