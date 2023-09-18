public class Operacion extends Expresion{
    public Operacion(Expresion ai, Expresion ad) {
        super("Operacion", "");
        this.ai = ai;
        this.ad = ad;
    }
    // Métodos para establecer tipo y valor
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    public void setValor(String valor) {
        super.setValor(valor);
    }
}
