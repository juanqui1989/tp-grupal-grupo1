public abstract class PcBuilder {
    protected Computadora compu;

    public Computadora getCompu() {
        return compu;
    }

    public abstract void  buildMother();
    public abstract void buildCpu();
    public abstract void  buildMemoriaRam();
    public abstract void buildMonitor();
}
