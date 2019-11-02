public class Notebook extends PcBuilder {

    /** "ConcreteBuilder" */

    public Notebook() {

        super.compu=new Computadora();
    }

    public void buildMother() {
        compu.setMother("Asus");
    }

    public void buildCpu() {

        compu.setCpu("Intel Core I7");
    }

    public void buildMemoriaRam() {

        compu.setMemoriaRam("Kingston");
    }

    public void buildMonitor() {
        compu.setMonitor("Sentey");
    }

}
