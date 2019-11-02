import java.util.List;

public class Computadora {
    private List<Componentes>componentes;
    private String mother="";
    private String procesador="";
    private String memoriaRam="";


    public void setComponentes(List<Componentes> componentes) {
        this.componentes = componentes;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public List<Componentes> getComponentes() {
        return componentes;
    }

    public String getMother() {
        return mother;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }
}
