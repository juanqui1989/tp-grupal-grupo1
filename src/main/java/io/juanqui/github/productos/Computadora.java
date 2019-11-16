package io.juanqui.github.productos;

public abstract class Computadora {
  private String memoria;
  private String procesador;
  private String placaMadre;
  private String placaDeVideo;

  public String getMemoria() {
    return memoria;
  }

  public Computadora setMemoria(String memoria) {
    this.memoria = memoria;
    return this;
  }

  public String getProcesador() {
    return procesador;
  }

  public Computadora setProcesador(String procesador) {
    this.procesador = procesador;
    return this;
  }

  public String getPlacaMadre() {
    return placaMadre;
  }

  public Computadora setPlacaMadre(String placaMadre) {
    this.placaMadre = placaMadre;
    return this;
  }

  public String getPlacaDeVideo() {
    return placaDeVideo;
  }

  public Computadora setPlacaDeVideo(String placaDeVideo) {
    this.placaDeVideo = placaDeVideo;
    return this;
  }
}
