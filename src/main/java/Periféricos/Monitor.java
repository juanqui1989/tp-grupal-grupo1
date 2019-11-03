package Periféricos;

import TiposDeComponentes.TipoComponente;

public class Monitor {
    private TipoComponente tipo;
    private int precio;

    public Monitor(TipoComponente tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public TipoComponente getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }
}
