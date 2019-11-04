import Componentes.*;
import Perisfericos.Headsets;
import Perisfericos.Monitor;
import TipoComponentes.TiposDeComponentes;

public class Tecnico {

    public void constructCaseGamer(){
        new Cpu(TiposDeComponentes.GAMER, 24000);
        new FanCooler(TiposDeComponentes.GAMER, 1000);
        new GraphicCard(25600);
        new Mother(TiposDeComponentes.GAMER, 12000);
        new PowerSupply(TiposDeComponentes.GAMER, 4000);
        new Hdd(4500);
        new Ram(TiposDeComponentes.GAMER, 6000);
    }

    public void constructDeskoptGamer(){
        new Headsets(TiposDeComponentes.GAMER, 1500);
        new Monitor(TiposDeComponentes.GAMER, 12500);


    }

    public void precioTotal(Computer computer, Case case1){
        int monitorPrecio = computer.getMonitor().getPrecio(),
                headsetsPrecio = computer.getHeadsets().getPrecio();

        int totalDeskopt = monitorPrecio+headsetsPrecio;

        int cpuPrecio = case1.getCpu().getPrecio(),
                coolerPrecio = case1.getCooler().getPrecio(),
                graficaPrecio = case1.getGraphicCard().getPrecio(),
                hddPrecio = case1.getHdd().getPrecio(),
                motherPrecio = case1.getMother().getPrecio(),
                fuentePrecio = case1.getPowerSupply().getPrecio(),
                ramPrecio = case1.getRam().getPrecio();

        int totalCase = cpuPrecio+coolerPrecio+graficaPrecio+hddPrecio+motherPrecio+fuentePrecio+ramPrecio;

        int total = totalDeskopt+totalCase;

        System.out.println("Precio final: $" + total );
    }
}
