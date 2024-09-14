/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sa;

/**
 *
 * @author miguelcatalan
 */
public class Leon extends Carnivoro {
    
    public void emitirSonido() {
        System.out.println("El león ruge!!!");
    }
    
    public void emitirSonido(String nombreSonido) {
        System.out.println("El león " + nombreSonido + "!!!");
    }
    
    public void cazar() {
        System.out.println("El leon sale a cazar...");
    }
    
}
