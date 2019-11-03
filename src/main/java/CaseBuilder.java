import Componentes.Case.*;

public interface CaseBuilder {
    void buildCpu(Cpu cpu);
    void buildFanCooler(FanCooler cooler);
    void buildGraphicCard(GraphicCard graphicCard);
    void buildHdd(Hdd hdd);
    void buildMother(Mother mother);
    void buildPowerSupply(PowerSupply powerSupply);
    void buildRam(Ram ram);
}
