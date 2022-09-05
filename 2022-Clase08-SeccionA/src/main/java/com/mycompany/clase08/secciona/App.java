/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase08.secciona;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class App {

    public static void main(String[] args) {

        // Declarando variables
        float totalKmConducidosDia;
        float costoGasolina;
        float totalKmLitro;
        float costoEstacionamientoDia;
        float costoPeajeDia;
        float costoGasolinaDia;
        float costoConducirTrabajoDia;

        // Inicializar variables
        totalKmConducidosDia = 0.0f;
        costoGasolina = 0.0f;
        totalKmLitro = 0.0f;
        costoEstacionamientoDia = 0.0f;
        costoPeajeDia = 0.0f;
        costoGasolinaDia = 0.0f;
        costoConducirTrabajoDia = 0.0f;
        
        Scanner scan = new Scanner(System.in);
        
        //Lectura de datos
        totalKmConducidosDia = scan.nextFloat();
        costoGasolina = scan.nextFloat();
        totalKmLitro = scan.nextFloat();
        costoEstacionamientoDia = scan.nextFloat();
        costoPeajeDia = scan.nextFloat();
        
        costoGasolinaDia = (totalKmConducidosDia * costoGasolina) / totalKmLitro;
        costoConducirTrabajoDia = costoGasolinaDia + costoEstacionamientoDia + costoPeajeDia;
  
        System.out.println(costoConducirTrabajoDia);
    }
}
