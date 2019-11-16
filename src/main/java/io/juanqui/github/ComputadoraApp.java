package io.juanqui.github;

import io.juanqui.github.Builders.PcBuilder;
import io.juanqui.github.Builders.PcGamerBuilder;
import io.juanqui.github.productos.PcGamer;

public class ComputadoraApp {
  public static void main(String[] args) {
    PcGamerBuilder gamerBuilder = new PcGamerBuilder(new PcGamer());

    gamerBuilder.crearComputadora();
    gamerBuilder.setMemoria()
            .setProcesador()
            .setPlacaMadre();
    PcGamer pc = gamerBuilder.getPcGamer();



    System.out.println(pc.getMemoria());
  }
}
