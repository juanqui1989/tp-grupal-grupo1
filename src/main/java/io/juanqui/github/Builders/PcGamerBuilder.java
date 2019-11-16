package io.juanqui.github.Builders;

import io.juanqui.github.productos.Computadora;
import io.juanqui.github.productos.PcGamer;

public class PcGamerBuilder extends PcBuilder {

  public PcGamerBuilder(Computadora computadora) {
    super(computadora);
  }

  public void crearComputadora() {
     this.computadora = new PcGamer();
  }

  public PcGamer getPcGamer() {
    return (PcGamer) computadora;
  }

  public Computadora setPlacaMadre() {
    computadora.setPlacaMadre("placa madre gamer");

  }

  public PcBuilder setMemoria() {
    computadora.setMemoria("memoria gamer");
    return this;

  }

  public PcBuilder setProcesador() {
    computadora.setProcesador("precesador gamer");
    return this;
  }

  public PcBuilder setPlacaDeVideo() {
    computadora.setPlacaDeVideo("placa de vide gamer");
    return this;
  }


}
