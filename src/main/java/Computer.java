
import Perisfericos.*;

public class Computer {

    private Case case1;
    private Monitor monitor;
    private Headsets headsets;

    public Computer(Case case1, Monitor monitor, Headsets headsets) {
        this.case1 = case1;
        this.monitor = monitor;
        this.headsets = headsets;
    }

    public void print(){
        System.out.println("Monitor " + monitor.getTipo() + ": $" +  monitor.getPrecio());
        System.out.println("Headsets " + headsets.getTipo()  +": $" +  headsets.getPrecio());
    }

    public void setCase(Case case1) {
        this.case1 = case1;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setHeadsets(Headsets auriculares) {
        this.headsets = auriculares;
    }

    public Case getCase() {
        return case1;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Headsets getHeadsets() {
        return headsets; }
}