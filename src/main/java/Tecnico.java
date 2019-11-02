public class Tecnico {
    /** "Director" */
    private PcBuilder pcBuilder;

    public void setPcBuilder(PcBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    public Computadora getComputadora() {
        return pcBuilder.getCompu();
    }

    public void construirPc(){
        pcBuilder.buildMother();
        pcBuilder.buildCpu();
        pcBuilder.buildMemoriaRam();
    }

}
