public enum ValorBooleano {
    TRUE(true), FALSE(false);

    private boolean valor;

    ValorBooleano(boolean valor) {
        this.valor = valor;
    }

    public boolean getValor() {
        return valor;
    }
}
