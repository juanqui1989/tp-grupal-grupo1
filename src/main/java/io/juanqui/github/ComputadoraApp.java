package io.juanqui.github;

import io.juanqui.github.Builders.PcBuilder;
import io.juanqui.github.Builders.PcEscritorioBuilder;
import io.juanqui.github.Builders.PcGamerBuilder;
import io.juanqui.github.productos.PcEscritorio;
import io.juanqui.github.productos.PcGamer;

public class ComputadoraApp {
  public static void main(String[] args) {
    PcGamerBuilder gamerBuilder = new PcGamerBuilder(new PcGamer());

    gamerBuilder.crearComputadora();
    gamerBuilder.setMemoria()
            .setPlacaMadre();
    PcGamer pc = gamerBuilder.getPcGamer();


    System.out.println(pc.getMemoria());

    PcEscritorioBuilder escritorioBuilder = new PcEscritorioBuilder(new PcEscritorio());

    escritorioBuilder.crearComputadora();
    escritorioBuilder.setMemoria()
            .setPlacaMadre();
    PcEscritorio pcEscritorio = escritorioBuilder.getPcEscritorio();

    System.out.println(pcEscritorio.getMemoria());
  }
}
