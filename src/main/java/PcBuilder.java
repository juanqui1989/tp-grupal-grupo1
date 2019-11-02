public abstract class PcBuilder {
    protected Computadora compu;

    public Comptadora getCompu() {
        return compu;
    }

    public abstract void  buildMother();
    public abstract void  buildProcesador();
    public abstract void  buildMemoriaRam();

}
