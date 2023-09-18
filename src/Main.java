import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su  expresión: ");
        String input = scanner.nextLine();
        List<String> lista = separarStringEnLista(input);

        for (String subcadena : lista) {
            System.out.println(subcadena);

            if("TRUE".equals(subcadena) || "FALSE".equals(subcadena)) {
                System.out.println("Es una contante booleana");
            }
            else if (esConstanteNumerica(subcadena)) {
                System.out.println("Es una constante");
            } else if ("+".equals(subcadena) || "*".equals(subcadena) || "-".equals(subcadena) || "/".equals(subcadena) || "%".equals(subcadena) || "||".equals(subcadena) || "&&".equals(subcadena)) {
                System.out.println("Es un operador");
            } else if ("return".equals(subcadena)) {
                System.out.println("Es un Return");
            } else if ("=".equals(subcadena)) {
                System.out.println("Es una asignación");
            } else {
                System.out.println("Es una variable");
            }
        }
    }

*/

        // Caso de prueba 1: x = 1
        Variable x = new Variable("x");
        Constante uno = new Constante();
        uno.setValor("1");
        Asignacion asignacion = new Asignacion(x, uno);

        // Caso de prueba 2: Return 42
        Expresion expresion = new Constante();
        expresion.setValor("42");
        Return retorno = new Return(expresion);

        // Caso de prueba 3: resultado = a + b
        Expresion operando1 = new Variable("a");
        Expresion operando2 = new Variable("b");
        Operacion suma = new Operacion(operando1, operando2);
        suma.setTipo("suma");

        Variable resultado = new Variable("resultado");
        Asignacion asignacionResultado = new Asignacion(resultado, suma);

        // Imprimir el árbol AST de cada caso de prueba
        System.out.println("Caso de prueba 1:");
        imprimirArbolAST(asignacion);

        System.out.println("\nCaso de prueba 2:");
        imprimirArbolAST(retorno);

        System.out.println("\nCaso de prueba 3:");
        imprimirArbolAST(asignacionResultado);
    }
    public static void imprimirArbolAST(AST nodo) {
        if (nodo == null) {
            return;
        }

        System.out.println("Tipo: " + nodo.getClass().getSimpleName());
        System.out.println("AI: " + (nodo.ai != null ? nodo.ai.getClass().getSimpleName() : "null"));
        System.out.println("AD: " + (nodo.ad != null ? nodo.ad.getClass().getSimpleName() : "null"));

        imprimirArbolAST(nodo.ai);
        imprimirArbolAST(nodo.ad);
    }

    public static List<String> separarStringEnLista(String input) {
        List<String> listaDeSubcadenas = new ArrayList<>();

        // Dividir el string en subcadenas usando el espacio como delimitador
        String[] subcadenas = input.split(" ");

        // Agregar cada subcadena a la lista
        for (String subcadena : subcadenas) {
            listaDeSubcadenas.add(subcadena);
        }

        return listaDeSubcadenas;
    }

    private static boolean esConstanteNumerica(String subcadena) {
        // Utiliza una expresión regular para verificar si es una constante numérica
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(subcadena);
        return matcher.matches();
    }
}