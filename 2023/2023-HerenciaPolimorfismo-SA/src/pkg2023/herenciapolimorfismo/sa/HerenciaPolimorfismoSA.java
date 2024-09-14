/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sa;

/**
 *
 * @author miguelcatalan
 */
public class HerenciaPolimorfismoSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Clase padre
        /*Animal a1 = new Animal();
        a1.comer();
        a1.dormir();
        a1.emitirSonido();*/
        
        //Carnivoro c1 = new Carnivoro();
        
        // Clases hijas
        //Elefante e1 = new Elefante();
        Animal e1 = new Elefante();
        /*e1.comer();
        e1.dormir();*/
        e1.emitirSonido();
        
        Animal l1 = new Leon();
        /*l1.comer();
        l1.dormir();*/
        l1.emitirSonido();
        //l1.
        //l1.emitirSonido("maulla");
        //l1.cazar();
        
    }
    
}
