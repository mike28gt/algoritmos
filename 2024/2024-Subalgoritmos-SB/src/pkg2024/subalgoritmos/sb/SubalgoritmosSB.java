/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.subalgoritmos.sb;

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
                    
                    System.out.println("Resultado desde el método main: " + sumar(primerNumero, segundoNumero));

                    
                    System.out.println("Regrese al método main...");
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
    */
    }
    
    public static int sumar(int parametroPrimerNumero, int parametroSegundoNumero) {
        System.out.println("Ingresa al método sumar...");
        /*
        int primerNumero = 0;
        int segundoNumero = 0;
        */
        int resultado = 0;
        /*
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese primer número: ");
        primerNumero = scan.nextInt();
        
        System.out.print("Ingrese segundo número: ");
        segundoNumero = scan.nextInt();
        */
        resultado = parametroPrimerNumero + parametroSegundoNumero;
        return resultado;
        //System.out.format("Resultado: %d\n", resultado);
    }
    
}
