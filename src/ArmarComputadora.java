//BuilderPcS
public abstract class ArmarComputadora {
    protected Computadora compu;

    public Computadora getCompu() {
        return compu;
    }
    public void crearComputadora(){
        compu = new Computadora();
    }
    public abstract void buildCrear();
}
