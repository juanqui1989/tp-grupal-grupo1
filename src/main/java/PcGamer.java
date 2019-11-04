import Componentes.*;
import Perisfericos.Headsets;
import Perisfericos.Monitor;

public class PcGamer  {
    private Case case1;
    private Monitor monitor;
    private Headsets headsets;


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
