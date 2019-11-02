public class Notebook extends PcBuilder {

    /** "ConcreteBuilder" */

    public Notebook() {
        super.compu= new Computadora();
    }

    public void buildMother() {
        compu.setMother("Gigabyte");
    }

    public void buildProcesador() {
        compu.setProcesador("Intel Core I7");
    }

    public void buildMemoriaRam() {
        compu.setMemoriaRam("Kingston");
    }
}
