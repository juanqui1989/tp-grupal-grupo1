package Componentes;

import TipoComponentes.TiposDeComponentes;

public class GraphicCard {
    private int precio;

    public GraphicCard(int precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}