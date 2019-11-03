package Periféricos;

import TiposDeComponentes.TipoComponente;

public class Headsets {
    private TipoComponente tipo;
    private int precio;

    public Headsets(TipoComponente tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoComponente getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }
}
