public class Tecnico {
    /** "Director" */
    private PcBuilder pcBuilder;

    public void setPcBuilder(PcBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }
    public  void Computadora

    public Comptadora getComputadora() {
        return pcBuilder.getCompu();
    }
    public void construirPc(){
        pcBuilder.buildMother();
        pcBuilder.buildProcesador();
        pcBuilder.buildMemoriaRam();
    }
}
