package Periféricos;

import TiposDeComponentes.TipoComponente;

public class Mouse {
    private TipoComponente tipo;
    private int precio;

    public Mouse(TipoComponente tipo, int precio) {
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
