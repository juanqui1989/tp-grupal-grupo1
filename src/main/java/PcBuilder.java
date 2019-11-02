public abstract class PcBuilder {
    protected Computadora compu;

    public Computadora getCompu() {
        return compu;
    }

    protected abstract void  buildMother();
    protected abstract void buildCpu();
    protected abstract void  buildMemoriaRam();
    protected abstract void buildMonitor();
}
