/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.ejemplo01.sa;

/**
 *
 * @author miguelcatalan
 */
public class Ejemplo01SA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Estructura para declarar una variable en Java:
        //          tipo_de_dato identificador;
        
        int edadEstudiante;
        String nombreEstudiante;
        float notaExamenCorto;
        char sexoEstudiante;
        boolean estaSolvente;
        
        // Inicialización de variables:
        //          Es la asignación de un valor a una variable
        //          por primera vez
        
        edadEstudiante = 10;
        nombreEstudiante = "Miguel Catalán";
        notaExamenCorto = 12.15f;
        sexoEstudiante = 'M';
        estaSolvente = true;
        
        
        {
            int var3;
            var3 = 32;
            {
                var3 = 45;
                int var2;
                {
                    var3 = 56;
                    int var1;
                    var1 = 10;
                    var2 = 23;
                }
                //var1=10;
                var2 = 30;
            }
            //var1=20;
            var2 = 409;
        }
        
    }
    
}
