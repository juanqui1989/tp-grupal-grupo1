import Componentes.*;

public class NormalCase {
    private Cpu cpu;
    private FanCooler cooler;
    private GraphicCard graphicCard;
    private Hdd hdd;
    private Mother mother;
    private PowerSupply powerSupply;
    private Ram ram;

    public NormalCase(Cpu cpu, FanCooler cooler, GraphicCard graphicCard, Hdd hdd, Mother mother, PowerSupply powerSupply, Ram ram) {
        this.cpu = cpu;
        this.cooler = cooler;
        this.graphicCard = graphicCard;
        this.hdd = hdd;
        this.mother = mother;
        this.powerSupply = powerSupply;
        this.ram = ram;
    }

    public Case getResult(){
        return new Case(mother, cpu, hdd, ram, cooler, powerSupply, graphicCard);
    }
}