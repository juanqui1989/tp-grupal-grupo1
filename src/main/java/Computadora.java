import java.util.List;

public class Computadora {

    private String mother="";
    private String cpu="";
    private String memoriaRam="";
    private String monitor="";



    public void setMother(String mother) {

        this.mother = mother;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }


    public boolean isMother(){
        if (this.getMother())
    }


    public String getMother() {
        return mother;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }
}
