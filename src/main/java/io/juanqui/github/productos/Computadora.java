package io.juanqui.github.productos;

public abstract class Computadora {
  private String memoria;
  private String procesador;
  private String placaMadre;
  private String placaDeVideo;

  public String getMemoria() {
    return memoria;
  }

  public void setMemoria(String memoria) {
    this.memoria = memoria;
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

  public void setPlacaMadre(String placaMadre) {
    this.placaMadre = placaMadre;
  }

  public String getPlacaDeVideo() {
    return placaDeVideo;
  }

  public void setPlacaDeVideo(String placaDeVideo) {
    this.placaDeVideo = placaDeVideo;
  }
}
