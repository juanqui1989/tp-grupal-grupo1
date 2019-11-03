package Periféricos;

import TiposDeComponentes.TipoComponente;

public class Keyboard {
    private TipoComponente tipo;
    private int precio;

    public Keyboard(TipoComponente tipo, int precio) {
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
