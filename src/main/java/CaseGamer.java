import Componentes.Case.*;

public class CaseGamer implements CaseBuilder {
    private Cpu cpu;
    private FanCooler cooler;
    private GraphicCard graphicCard;
    private Hdd hdd;
    private Mother mother;
    private PowerSupply powerSupply;
    private Ram ram;

    @Override
    public void buildCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void buildFanCooler(FanCooler cooler) {
        this.cooler = cooler;
    }

    @Override
    public void buildGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public void buildHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public void buildMother(Mother mother) {
        this.mother = mother;
    }

    @Override
    public void buildPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void buildRam(Ram ram) {
        this.ram = ram;
    }

    public Case getResult(){
        return new Case(mother, cpu, hdd, ram, cooler, powerSupply, graphicCard);
    }
}
