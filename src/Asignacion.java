public class Asignacion extends Sentencia {
    private Variable ai;
    private Expresion ad;

    // Constructor
    public Asignacion(Variable ai, Expresion ad) {
        super(ai, ad);
        this.ai = ai;
        this.ad = ad;
    }
}
