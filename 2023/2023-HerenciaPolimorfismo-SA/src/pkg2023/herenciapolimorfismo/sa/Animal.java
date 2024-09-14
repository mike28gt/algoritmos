/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sa;

/**
 *
 * @author miguelcatalan
 */
public abstract class Animal {
    
    private float peso;
    private int edad;
    private float tamanio;
    private boolean tieneHambre;
    
    public void dormir() {
        System.out.println("El animal duerme...");
    }
    
    public void emitirSonido() {
        System.out.println("El animal emite sonido...");
    }
    
    public void comer() {
        if (this.tieneHambre) {
            System.out.println("El animal come...");
        }
        else {
            System.out.println("El animal no tiene hambre...");
        }
    }
    
}
