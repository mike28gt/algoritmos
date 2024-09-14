/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.herenciapolimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public class HerenciaPolimorfismoSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Animal a1 = new Animal();
        //a1.comer();
        /*a1.beber();
        a1.comer();
        a1.defecar();*/
        
        Ruminante r1 = new Ruminante();
        
        Jirafa j1 = new Jirafa();
        /*j1.rumear();
        j1.beber();
        j1.comer();
        j1.defecar();*/
        
        Elefante e1 = new Elefante();
        //e1.beber();
        e1.comer();
        e1.comer("bayas");
        /*e1.defecar();
        e1.rumear();*/
        
        Leon l1 = new Leon();
        l1.comer();     
        
        Mono m1 = new Mono();
        /*m1.beber();
        m1.comer();
        m1.defecar();*/
      
        
    }
    
}
