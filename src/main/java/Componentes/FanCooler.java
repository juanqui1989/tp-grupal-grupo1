
package Componentes;

import TipoComponentes.TiposDeComponentes;

    public class FanCooler {
        private TiposDeComponentes tipo;
        private int precio;

    public FanCooler(TiposDeComponentes tipo, int precio) {
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