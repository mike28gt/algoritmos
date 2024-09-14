/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public abstract class Animal {
    
    private char sexo;
    private String raza;
    private float fuerza;
    private float tamanio;
    
    public void defecar() {
        System.out.println("El animal defeca...");
    }
    
    public void beber() {
        System.out.println("El animal bebe...");
    }
    
    public void comer() {
        System.out.println("El animal come...");
    }
    
}
