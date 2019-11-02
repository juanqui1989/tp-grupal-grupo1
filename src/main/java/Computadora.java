import java.util.List;

public class Computadora {

    private String mother="";
    private String procesador="";
    private String memoriaRam="";




    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
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
