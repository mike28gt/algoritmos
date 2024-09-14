/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.manejodecadenas.sb;

/**
 *
 * @author miguelcatalan
 */
public class ManejoDeCadenasSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1;
        float var2;
        boolean var3;
        char var4;
        
        String nombreEstudiante = "Miguel";
        
        String versoUno = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony";
        String versoDos = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony Swaying to the symphony of destruction";
        
        //Concatenación de cadenas
        String versoUnoYDos = versoUno + versoDos;
        versoUnoYDos = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony" + "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony Swaying to the symphony of destruction";
        versoUnoYDos = versoUno + "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony Swaying to the symphony of destruction";
        System.out.println(versoUnoYDos);
        
        versoUnoYDos = versoDos + versoUno;
        System.out.println(versoUnoYDos);
        
        
        //Longitud de cadenas
        versoUnoYDos = versoUno + versoDos;
        int longitudCadena = versoUnoYDos.length();
        System.out.println(longitudCadena);
        
        //Obtener un caracter de una cadena
        nombreEstudiante = "Miguel";
        //                  123456
        //                  012345 Java es un lenguaje basado en indice 0, por lo que empieza a contar a partir del 0
        char caracter = nombreEstudiante.charAt(3);
        System.out.println(caracter);
        
        //Obtener el índice de un caracter
        nombreEstudiante = "Miguel";
        
        int indice = nombreEstudiante.indexOf('i');
        System.out.println(indice);
        
        //Obtención de subcadenas
        versoUno = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony";
        
        String subcadena = versoUno.substring(0, 53);
        System.out.println(subcadena);
        
        //Caracter de escape
        versoUno = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony";
        System.out.println(versoUno);
        
        versoUno = "Just like the Pied Piper Led rats through the streets \nWe dance like marionettes Swaying to the symphony";
        System.out.println(versoUno);
        
        //Convertir una cadena a minusculas
        versoUno = "Just like the Pied Piper Led rats through the streets \nWe dance like marionettes Swaying to the symphony";
        String cadenaMinusculas = versoUno.toLowerCase();
        System.out.println(cadenaMinusculas);
        
        //Convertir una cadena a mayúsculas
        versoUno = "Just like the Pied Piper Led rats through the streets \nWe dance like marionettes Swaying to the symphony";
        String cadenaMayusculas = versoUno.toUpperCase();
        System.out.println(cadenaMayusculas);
        
        //Comparación entre cadenas
        String primerNombre = "Miguel";
        String segundoNombre = "Panchito";
        
        boolean esIgual = primerNombre.equals(segundoNombre);
        System.out.println(esIgual);
        
        primerNombre = "Miguel";
        segundoNombre = "Miguel";
        
        esIgual = primerNombre.equals(segundoNombre);
        System.out.println(esIgual);
                
        primerNombre = "Miguel";
        segundoNombre = "miguel";
        
        esIgual = primerNombre.equalsIgnoreCase(segundoNombre);
        System.out.println(esIgual);
        
        //Búsqueda de subcadenas
        versoUno = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony";
        
        boolean empiezaCon = versoUno.startsWith("Ju");
        System.out.println(empiezaCon);
        
        boolean terminaCon = versoUno.endsWith("symphony");
        System.out.println(terminaCon);
        
        boolean contiene = versoUno.contains("the streets");
        System.out.println(contiene);
        
        //Reemplazo de valores
        versoUno = "Just like the Pied Piper Led rats through the streets We dance like marionettes Swaying to the symphony";
        System.out.println(versoUno);
        
        String verUnoReemplazo = versoUno.replace("rats", "pigs");
        System.out.println(verUnoReemplazo);
        
        verUnoReemplazo = versoUno.replace("like", "");
        System.out.println(verUnoReemplazo);
        
        //Eliminación de espacios
        primerNombre = " Miguel  Catalan  ";
        System.out.println("|"+primerNombre+"|");
        
        String primerNombreSiEspacios = primerNombre.strip();
        System.out.println("|"+primerNombreSiEspacios+"|");
        
        primerNombreSiEspacios = primerNombre.trim();
        System.out.println("|"+primerNombreSiEspacios+"|");
        
        String nombreSinEspaciosInicio = primerNombre.stripLeading();
        System.out.println("|"+nombreSinEspaciosInicio+"|");
        
        String nombreSinEspaciosFinal = primerNombre.stripTrailing();
        System.out.println("|"+nombreSinEspaciosFinal+"|");
        
        //Evaluación de cadenas vacías
        String cadenaBlanco = "    ";
        String cadenaVacia = "";
        
        boolean estaVacia = cadenaBlanco.isEmpty();
        System.out.println(estaVacia);
        
        estaVacia = cadenaVacia.isEmpty();
        System.out.println(estaVacia);
        
        boolean espaciosBlanco = cadenaBlanco.isBlank();
        System.out.println(espaciosBlanco);
        
        espaciosBlanco = cadenaVacia.isBlank();
        System.out.println(espaciosBlanco);
    }
    
    
}
