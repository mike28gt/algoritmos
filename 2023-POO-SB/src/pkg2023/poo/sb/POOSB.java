/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.poo.sb;

/**
 *
 * @author miguelcatalan
 */
public class POOSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carroDeCindy = new Carro();
        Carro carroDeSergio = new Carro();
        
        /* Sin encapsulamiento
        carroDeCindy.color = "Negro";
        carroDeCindy.marca = "Toyota";
        carroDeCindy.cantidadPuertas = 4;
        carroDeCindy.duenio = "Cindy";
        carroDeCindy.cantidadCilindros = 4;
        carroDeCindy.tamanioMotor = 1.5f;
        
        carroDeSergio.color = "Negro Mate";
        carroDeSergio.marca = "Mazda";
        carroDeSergio.cantidadPuertas = 4;
        carroDeSergio.duenio = "Sergio";
        carroDeSergio.cantidadCilindros = 4;
        carroDeSergio.tamanioMotor = 1.8f;
        
        System.out.println("Carro de Sergio: Color " + carroDeSergio.color);
        System.out.println("Carro de Cindy: Color " + carroDeCindy.color);
        */
        
        // Con encapsulamiento
        carroDeCindy.setColor("Negro");
        carroDeCindy.setMarca("Toyota");
        carroDeCindy.setCantidadPuertas(4);
        carroDeCindy.setDuenio("Cindy");
        carroDeCindy.setCantidadCilindros(4);
        carroDeCindy.setTamanioMotor(1.5f);
        
        carroDeSergio.setColor("Negro Mate");
        carroDeSergio.setMarca("Mazda");
        carroDeSergio.setCantidadPuertas(4);
        carroDeSergio.setDuenio("Sergio");
        carroDeSergio.setCantidadCilindros(4);
        carroDeSergio.setTamanioMotor(1.8f);
        
        System.out.println("Carro de Sergio: Color " + carroDeSergio.getColor());
        System.out.println("Carro de Cindy: Color " + carroDeCindy.getColor());
        
        carroDeSergio.arrancar();
        carroDeCindy.arrancar();
        
        Carro carroDeJose = new Carro();
        carroDeJose.setColor("Azul");
    }
}
