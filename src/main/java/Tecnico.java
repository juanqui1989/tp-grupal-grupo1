import Componentes.Case.*;
import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;
import TiposDeComponentes.TipoComponente;

public class Tecnico {
    /** "Director" */

    public void constructCaseGamer(CaseBuilder builder){
        builder.buildCpu(new Cpu(TipoComponente.GAMER, 24000));
        builder.buildFanCooler(new FanCooler(TipoComponente.GAMER, 1000));
        builder.buildGraphicCard(new GraphicCard(25600));
        builder.buildMother(new Mother(TipoComponente.GAMER, 12000));
        builder.buildPowerSupply(new PowerSupply(TipoComponente.GAMER, 4000));
        builder.buildHdd(new Hdd(4500));
        builder.buildRam(new Ram(TipoComponente.GAMER, 6000));
    }
    public void constructDeskoptGamer(Builder builder){
        builder.buildHeadsets(new Headsets(TipoComponente.GAMER, 1500));
        builder.buildKeyboard(new Keyboard(TipoComponente.GAMER,2000));
        builder.buildMonitor(new Monitor(TipoComponente.GAMER, 12500));
        builder.buildMouse(new Mouse(TipoComponente.GAMER, 1700));

    }

    public void precioTotal(Computer computer, Case case1){
        int monitorPrecio = computer.getMonitor().getPrecio(),
                headsetsPrecio = computer.getHeadsets().getPrecio(),
                keyboardPrecio = computer.getKeyboard().getPrecio(),
                mousePrecio = computer.getMouse().getPrecio();

        int totalDeskopt = monitorPrecio+mousePrecio+headsetsPrecio+keyboardPrecio;

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
