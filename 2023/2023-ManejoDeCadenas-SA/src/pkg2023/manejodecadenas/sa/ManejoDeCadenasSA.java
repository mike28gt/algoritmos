/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023.manejodecadenas.sa;

/**
 *
 * @author miguelcatalan
 */
public class ManejoDeCadenasSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1;
        char var2;
        float var3;
        boolean var4;
        
        
        String nombrePersona = "Miguel";
        
        // Concatenación de cadenas
        
        String primerVerso = "Contare la historia de una famosa persona Todos la conocen con el apodo de chona Todos la conocen con el apodo de chona";
        String segundoVerso = "Su marido dice ya no sé que hacer con ella Diario va a los bailes y se compra una botella Diario va a los bailes y se compra una botella";
        
        //String primerYSegundoVerso = primerVerso + segundoVerso;
        //String primerYSegundoVerso = "Contare la historia de una famosa persona Todos la conocen con el apodo de chona Todos la conocen con el apodo de chona" + "Su marido dice ya no sé que hacer con ella Diario va a los bailes y se compra una botella Diario va a los bailes y se compra una botella";
        String primerYSegundoVerso = primerVerso + "Su marido dice ya no sé que hacer con ella Diario va a los bailes y se compra una botella Diario va a los bailes y se compra una botella";
        
        System.out.println(primerYSegundoVerso);
        
        //Caracteres de escape
        String caracteresDeEscape = "Contare la historia de una famosa persona\nTodos la conocen con el apodo de chona\nTodos la conocen con el apodo de chona\n\n" + "Su marido dice ya no sé que hacer con ella\nDiario va a los bailes y se compra una botella\nDiario va a los bailes y se compra una botella";
        System.out.println(caracteresDeEscape);
        
        //Longitud de una cadena
        int longitudCadena = nombrePersona.length();
        System.out.println(longitudCadena);
        
        longitudCadena = primerYSegundoVerso.length();
        System.out.println(longitudCadena);
        
        //
        
        //Obtener caracter de una cadena
        nombrePersona = "Miguel";
        //               123456 No es utilizado por Java
        //               012345 Conteo basado en índice 0 - índice
        
        char caracter = nombrePersona.charAt(3);
        System.out.println(caracter);
        
        //Determinar el índice de un caracter
        nombrePersona = "Miguelu";
        
        int indice = nombrePersona.indexOf('u');
        System.out.println(indice);
        
        indice = nombrePersona.indexOf('u', 4);
        System.out.println(indice);
        
        
        //Subcadenas
        primerVerso = "Contare la historia de una famosa persona Todos la conocen con el apodo de chona Todos la conocen con el apodo de chona";
        
        String subcadena = primerVerso.substring(0, 41);
        System.out.println(subcadena);
        
        //Convertir cadena a minúsculas
        caracteresDeEscape = "Contare la historia de una famosa persona\nTodos la conocen con el apodo de chona\nTodos la conocen con el apodo de chona\n\n" + "Su marido dice ya no sé que hacer con ella\nDiario va a los bailes y se compra una botella\nDiario va a los bailes y se compra una botella";
        
        String minusculas = caracteresDeEscape.toLowerCase();
        System.out.println(minusculas);
        
        //Convertir cadena a mayúsculas
        caracteresDeEscape = "Contare la historia de una famosa persona\nTodos la conocen con el apodo de chona\nTodos la conocen con el apodo de chona\n\n" + "Su marido dice ya no sé que hacer con ella\nDiario va a los bailes y se compra una botella\nDiario va a los bailes y se compra una botella";
        
        String mayusculas = caracteresDeEscape.toUpperCase();
        System.out.println(mayusculas);
        
        // Comparación entre cadenas
        String primerNombre = "Miguel";
        String segundoNombre = "Juanito";
        
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
        
        
        //Busquedas en subcadenas
        primerVerso = "Contare la historia de una famosa persona Todos la conocen con el apodo de chona Todos la conocen con el apodo de chona";
        
        boolean empiezaCon = primerVerso.startsWith("Con");
        System.out.println(empiezaCon);
        
        empiezaCon = primerVerso.startsWith("la");
        System.out.println(empiezaCon);
        
        boolean terminaCon = primerVerso.endsWith("a");
        System.out.println(terminaCon);
        
        terminaCon = primerVerso.endsWith("de");
        System.out.println(terminaCon);
        
        boolean contiene = primerVerso.contains("famosa");
        System.out.println(contiene);
        
        contiene = primerVerso.contains("safamo");
        System.out.println(contiene);
        
        //Reemplazo de valores
        primerVerso = "Contare la historia de una famosa persona Todos la conocen con el apodo de chona Todos la conocen con el apodo de chona";
        
        String textoReemplazado = primerVerso.replace("persona", "mujer");
        System.out.println(textoReemplazado);
        
        // Eliminación de espacios en blanco
        primerNombre = "  Miguel   Catalan   ";
        System.out.println("|"+primerNombre+"|");
        
        String primerNombreSinEspacios = primerNombre.strip();
        System.out.println("|"+primerNombreSinEspacios+"|");
        
        primerNombreSinEspacios = primerNombre.trim();
        System.out.println("|"+primerNombreSinEspacios+"|");
        
        primerNombreSinEspacios = primerNombre.stripLeading();
        System.out.println("|"+primerNombreSinEspacios+"|");
        
        primerNombreSinEspacios = primerNombre.stripTrailing();
        System.out.println("|"+primerNombreSinEspacios+"|");
        
        //Evaluación de cadenas vacías
        String cadenaEspaciosEnBlanco = "   ";
        String cadenaVacia = "";
        
        boolean esBlancos = cadenaEspaciosEnBlanco.isBlank();
        System.out.println(esBlancos);
        
        cadenaEspaciosEnBlanco = "  a ";
        esBlancos = cadenaEspaciosEnBlanco.isBlank();
        System.out.println(esBlancos);
        
        esBlancos = cadenaVacia.isBlank();
        System.out.println(esBlancos);
        
        boolean esVacia = cadenaEspaciosEnBlanco.isEmpty();
        System.out.println(esVacia);
        
        esVacia = cadenaVacia.isEmpty();
        System.out.println(esVacia);
        
    }   
    
}
