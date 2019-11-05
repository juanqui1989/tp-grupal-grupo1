//Director
public class Tecnico {
    private ArmarComputadora computadora;
    public Computadora getComputadora() {
        return computadora.getCompu();
    }
    public void setComputadora(ArmarComputadora computadora) {
        this.computadora = computadora;
    }
    public void crearComputadora(){
    computadora.crearComputadora();
    computadora.buildCrear();
    }
}
