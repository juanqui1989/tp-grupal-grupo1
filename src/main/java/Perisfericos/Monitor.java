package Perisfericos;

import TipoComponentes.TiposDeComponentes;

public class Monitor {
    private TiposDeComponentes tipo;
    private int precio;

    public Monitor(TiposDeComponentes tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public TiposDeComponentes getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }
}