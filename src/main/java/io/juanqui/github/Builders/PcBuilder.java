package io.juanqui.github.Builders;

import io.juanqui.github.productos.Computadora;

public abstract class PcBuilder {
  protected Computadora computadora;

  public PcBuilder(Computadora computadora) {
    this.computadora = computadora;
  }

  public abstract void crearComputadora();

  public abstract PcBuilder setPlacaMadre();


  public abstract PcBuilder setMemoria();

  public abstract PcBuilder setProcesador();


  public abstract PcBuilder setPlacaDeVideo();
}
