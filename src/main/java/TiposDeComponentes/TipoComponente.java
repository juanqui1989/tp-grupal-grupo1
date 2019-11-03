package TiposDeComponentes;

public enum TipoComponente {
    OFFICE("Office"),
    GAMER("Gamer");

    private final String tipo;

    TipoComponente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
