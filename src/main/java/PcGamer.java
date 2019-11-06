import Componentes.*;
import Perisfericos.Headsets;
import Perisfericos.Monitor;

public class PcGamer  {
    public Case case1;
    public Monitor monitor;
    public Headsets headsets;

    public PcGamer(Case case1, Monitor monitor, Headsets headsets) {
        this.case1 = case1;
        this.monitor = monitor;
        this.headsets = headsets;
    }

    public void buildMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public void buildHeadsets(Headsets headsets) {
        this.headsets = headsets;
    }

    public Computer getResult(){
        return new Computer(case1, monitor, headsets);
    }
}
