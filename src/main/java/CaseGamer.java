import Componentes.*;
import Perisfericos.Headsets;
import Perisfericos.Monitor;

class CaseGamer  {
    private Cpu cpu;
    private FanCooler cooler;
    private GraphicCard graphicCard;
    private Hdd hdd;
    private Mother mother;
    private PowerSupply powerSupply;
    private Ram ram;
    private Monitor monitor;
    private Headsets headsets;


    public void buildCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void buildFanCooler(FanCooler cooler) {
        this.cooler = cooler;
    }

    public void buildGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void buildHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void buildMother(Mother mother) {
        this.mother = mother;
    }

    public void buildPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void buildRam(Ram ram) {
        this.ram = ram;
    }

    public Case getResult(){
        return new Case(mother, cpu, hdd, ram, cooler, powerSupply, graphicCard);
    }
}