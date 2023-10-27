/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.poo.sa;

/**
 *
 * @author miguelcatalan
 */
public class POOSA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carroDeCarmen = new Carro();
        Carro carroDeKevin = new Carro();
        
        /* Sin encapsulamiento
        carroDeCarmen.color = "Plateado";
        carroDeCarmen.marca = "Nissan";
        carroDeCarmen.modelo = 2016;
        carroDeCarmen.cantidadCilindros = 4;
        carroDeCarmen.arrancar();
        carroDeCarmen.acelarar();
        
        carroDeKevin.color = "Azul";
        carroDeKevin.marca = "Hyundai";
        carroDeKevin.modelo = 2013;
        carroDeKevin.cantidadCilindros = 4;
        carroDeKevin.arrancar();
        carroDeKevin.acelarar();
        
        System.out.println("Carro de Carmen: Color " + carroDeCarmen.color);
        System.out.println("Carro de Kevin: Color " + carroDeCarmen.color);
        */
        
        // Con encapsulamiento
        carroDeCarmen.setColor("Plateado");
        carroDeCarmen.setMarca("Nissan");
        carroDeCarmen.setModelo(2016);
        carroDeCarmen.setCantidadCilindros(4);
        carroDeCarmen.arrancar();
        carroDeCarmen.acelarar();
        
        carroDeKevin.setColor("Azul");
        carroDeKevin.setMarca("Hyundai");
        carroDeKevin.setModelo(2013);
        carroDeKevin.setCantidadCilindros(4);
        carroDeKevin.arrancar();
        carroDeKevin.acelarar();
        
        Carro carroDeRafael = new Carro();
        carroDeRafael.setColor("Negro");
        
        System.out.println("Carro de Carmen: Color " + carroDeCarmen.getColor());
        System.out.println("Carro de Kevin: Color " + carroDeKevin.getColor());
        System.out.println("Carro de Kevin: Cilindros " + carroDeKevin.getCantidadCilindros());
    }
    
}
