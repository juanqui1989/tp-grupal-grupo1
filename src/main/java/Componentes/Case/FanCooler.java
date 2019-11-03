package Componentes.Case;

import TiposDeComponentes.TipoComponente;

public class FanCooler {
    private TipoComponente tipo;
    private int precio;

    public FanCooler(TipoComponente tipo, int precio) {
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
