package io.juanqui.github.Builders;

import io.juanqui.github.productos.Computadora;
import io.juanqui.github.productos.PcEscritorio;

public class PcEscritorioBuilder  extends PcBuilder{

  public PcEscritorioBuilder(Computadora computadora) {
    super(computadora);
  }

  public void crearComputadora() {
    this.computadora = new PcEscritorio();
  }

  public PcEscritorio getPcEscritorio() {
    return (PcEscritorio) computadora;
  }

  public PcBuilder setPlacaMadre() {
    computadora.setPlacaMadre("Soy la placa madre escritorio");
    return this;
  }

  public PcEscritorio getPcGamer() {
    return (PcEscritorio) computadora;
  }

  public PcBuilder setMemoria() {
        computadora.setMemoria("Soy la memoria escritorio");
        return this;
      }

      public PcBuilder setProcesador() {
        computadora.setProcesador("Soy el procesador escritorio");
        return this;
      }

      public PcBuilder setPlacaDeVideo() {
        computadora.setPlacaDeVideo("placa de video de escritorio");
        return this;
      }
    }













