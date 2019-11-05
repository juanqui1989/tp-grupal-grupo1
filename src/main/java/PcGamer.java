import Componentes.*;
import Perisfericos.Headsets;
import Perisfericos.Monitor;

public class PcGamer  {
    private Case case1;
    private Monitor monitor;
    private Headsets headsets;

    public PcGamer(int case1, String monitor, String headsets) {
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
