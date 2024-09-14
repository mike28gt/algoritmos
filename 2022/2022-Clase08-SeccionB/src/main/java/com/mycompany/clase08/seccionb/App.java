/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase08.seccionb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {
        
        // Declaración de variables
        float totalKmConducidos;
        float costoLitroGasolina;
        float promedioKmLitro;
        float cuotasEstacionamientoDia;
        float peajeDia;
        float costoGasolinaDia;
        float costoConducirOficinaDia;
        
        // Inicialización de variables
        totalKmConducidos = 0.0f;
        costoLitroGasolina = 0.0f;
        promedioKmLitro = 0.0f;
        cuotasEstacionamientoDia = 0.0f;
        peajeDia = 0.0f;
        costoGasolinaDia = 0.0f;
        costoConducirOficinaDia = 0.0f;
        
        Scanner scan = new Scanner(System.in); 
        
        totalKmConducidos = scan.nextFloat();
        costoLitroGasolina = scan.nextFloat();
        promedioKmLitro = scan.nextFloat();
        cuotasEstacionamientoDia = scan.nextFloat();
        peajeDia = scan.nextFloat();
        
        costoGasolinaDia = (totalKmConducidos * costoLitroGasolina) / promedioKmLitro;
        costoConducirOficinaDia = costoGasolinaDia + cuotasEstacionamientoDia + peajeDia;
        
        System.out.println(costoConducirOficinaDia);
    }
}
