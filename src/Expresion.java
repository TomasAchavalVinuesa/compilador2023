public class Expresion extends AST{
    private String tipo;
    private String valor;

    // Constructor
    public Expresion(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    // Métodos para establecer tipo y valor
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
