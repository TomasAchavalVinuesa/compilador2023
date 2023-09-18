public class Variable extends Expresion{
    private String nombre;

    // Constructor
    public Variable(String nombre) {
        super("Variable", "");
        this.nombre = nombre;
    }
}
