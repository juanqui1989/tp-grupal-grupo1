import Componentes.Case.*;

public class CaseGamer {
    private Cpu cpu;
    private FanCooler cooler;
    private GraphicCard graphicCard;
    private Hdd hdd;
    private Mother mother;
    private PowerSupply powerSupply;
    private Ram ram;

    public CaseGamer(Cpu cpu, FanCooler cooler, GraphicCard graphicCard, Hdd hdd, Mother mother, PowerSupply powerSupply, Ram ram) {
        this.cpu = cpu;
        this.cooler = cooler;
        this.graphicCard = graphicCard;
        this.hdd = hdd;
        this.mother = mother;
        this.powerSupply = powerSupply;
        this.ram = ram;
    }
}