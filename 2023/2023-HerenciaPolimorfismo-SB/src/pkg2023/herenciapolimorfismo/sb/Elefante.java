/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public class Elefante extends Ruminante {
    
    public void comer() {
        System.out.println("El elefante come hierbas...");
    }
    
    public void comer(String comida) {
        System.out.println("El elefante come " + comida + "...");
    }
    
    
}
