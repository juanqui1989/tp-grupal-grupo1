package Componentes.Case;

import TiposDeComponentes.TipoComponente;

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
