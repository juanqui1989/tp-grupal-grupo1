package Componentes;

import TipoComponentes.TiposDeComponentes;

public class PowerSupply {
    private TiposDeComponentes tipo;
    private int precio;

    public PowerSupply(TiposDeComponentes tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TiposDeComponentes getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }
}