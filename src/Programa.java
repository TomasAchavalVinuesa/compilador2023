import java.util.ArrayList;
import java.util.Collections;


public class Programa {
    ArrayList<AST> lineasCodigoAST = new ArrayList<AST>(); //hacer un array list permitirá la ejecución de ciclos de código
    //cada elemento del arraylist es un arbol propio en si mismo que representan 1 linea de código desde el anterios ; sin incluirlo hasta el nuevo ; incluido
    String programa; //el programa recibe un string o próximamente un archivo de texto que dice todas las instrucciones del programa
    ArrayList<String> lineasCodigoString = new ArrayList<String>(); /* en cada elemento del array list se pondrá una linea de código completa (esto también ayudará a poder controlar
    mejor el uso de ciclos)*/

    public void separarPrograma(String programa) {
        this.programa =programa;

        String[] subcadenas = programa.split(";"); // Dividir el string en subcadenas usando el ; como delimitador


        for (String subcadena : subcadenas) {
            lineasCodigoString.add(subcadena.trim() + ";"); // trim() elimina espacios en blanco al principio y al final
        }
    }
    public Programa(String programa) { //se tendrá que implementar una clase estática que
        //acá tendría que implementar un método para separar el String programa en lineas de código individuales y almacenarlas en ArrayList lineasCodigoString
        separarPrograma(programa);
        for (String subcadena : lineasCodigoString) {
            System.out.println(subcadena);
        }
        //acá tendría que implementar otro método para convertir cada elementos del ArrayList lineasCodigoString en arboles AST que sean cada uno, un elemento del arrayList lineasCodigoAST
    }


}