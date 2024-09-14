/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.poo.sb;

/**
 *
 * @author miguelcatalan
 */
public class Carro {
    
    // Atributos
    private int cantidadPuertas;
    private float tamanioMotor;
    private int cantidadCilindros;
    private String color;
    private String marca;
    private String duenio;
    
    // getter
    // setter

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public float getTamanioMotor() {
        return tamanioMotor;
    }

    public void setTamanioMotor(float tamanioMotor) {
        this.tamanioMotor = tamanioMotor;
    }

    public int getCantidadCilindros() {
        return cantidadCilindros;
    }

    public void setCantidadCilindros(int cantidadCilindros) {
        this.cantidadCilindros = cantidadCilindros;
    }

    public String getColor() {
        return color + " (Color Autorizado)" ;
    }

    public void setColor(String color) {
        if (color.compareTo("Azul") == 0) {
            System.err.println("No es permitido el color azul en un carro.");
        }
        else {
            this.color = color;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    // Métodos
    public void arrancar() {
        System.out.println("Se arranca el carro de " + duenio);
    }
    
    public void acelerar() {
        System.out.println("Se acelera el carro de " + duenio);
    }
    
    public void frenar() {
        System.out.println("Se frena el carro de " + duenio);
    }
    
    public void bocinar() {
        System.out.println(duenio + " bocina al carro de adelante.");
    }
}
