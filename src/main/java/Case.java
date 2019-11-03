import Componentes.Case.*;

public class Case {
    private Mother mother;
    private Cpu cpu;
    private Hdd hdd;
    private Ram ram;
    private FanCooler cooler;
    private PowerSupply powerSupply;
    private GraphicCard graphicCard;

    public Case(Mother mother, Cpu cpu, Hdd hdd, Ram ram, FanCooler cooler, PowerSupply powerSupply, GraphicCard graphicCard) {
        this.mother = mother;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.cooler = cooler;
        this.powerSupply = powerSupply;
        this.graphicCard = graphicCard;
    }

    public String print(){
        String info = "";
        info += "Mother " + mother.getTipo()+ ": $" + mother.getPrecio() + "\n";
        info += "Cpu " + cpu.getTipo() + ": $" + cpu.getPrecio() + "\n";
        info += "Hdd" + ": $" + hdd.getPrecio() + "\n";
        info += "Ram " + ram.getTipo() + ": $" + ram.getPrecio() + "\n";
        info += "Cooler " + cooler.getTipo() + ": $" + cooler.getPrecio() + "\n";
        info += "Power Supply " + powerSupply.getTipo() + ": $" + powerSupply.getPrecio() + "\n";
        info += "Graphic Card" + ": $" + graphicCard.getPrecio() + "\n";
        return  info;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHdd(Hdd hdd) {
        hdd = hdd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setCooler(FanCooler cooler) {
        this.cooler = cooler;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Mother getMother() {
        return mother;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public FanCooler getCooler() {
        return cooler;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }
}
