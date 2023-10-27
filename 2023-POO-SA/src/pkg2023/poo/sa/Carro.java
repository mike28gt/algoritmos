/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.poo.sa;

/**
 *
 * @author miguelcatalan
 */
public class Carro {
    // Atributos
    private String color;
    private int modelo;
    private String marca;
    private int cantidadCilindros = 0;
    
    //getter
    //setter
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.compareTo("Negro") == 0) {
            System.err.println("No se permite la asignación de color negro a los vehículos.");
        } 
        else {
        this.color = color;
        }
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidadCilindros() {
        float cantidadCilindros = (float)this.cantidadCilindros;
        return String.format("%.1f", cantidadCilindros);
    }

    public void setCantidadCilindros(int cantidadCilindros) {
        this.cantidadCilindros = cantidadCilindros;
    }
    
    // Métodos
    public void arrancar() {
        System.out.println("Se arranca el carro.");
    }
    
    public void acelarar() {
        System.out.println("Se acelera el carro.");
    }
    
    public void frenar() {
        System.out.println("Se frena el carro.");
    }
    
    public void bocinar() {
        System.out.println("Se bocina al conductor del vehículo de adelante.");
    }
}
