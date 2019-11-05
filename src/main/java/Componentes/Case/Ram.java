package Componentes.Case;

import TiposDeComponentes.TipoComponente;

public class Ram {
    private TipoComponente tipo;
    private int precio;
    private int capacidad;

    public Ram(TipoComponente tipo, int precio,int capacidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.capacidad=capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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