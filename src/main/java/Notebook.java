import Perisfericos.Headsets;
import Perisfericos.Monitor;

public class Notebook   {

    private Case case1;
    private Monitor monitor;
    private Headsets headsets;

    public Notebook(Case case1, Monitor monitor, Headsets headsets) {
        this.case1 = case1;
        this.monitor = monitor;
        this.headsets = headsets;
    }

    public void modificaMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public void modificaHeadsets(Headsets headsets){
        this.headsets=headsets;
    }

    public Computer getResult(){
        return new Computer(case1, monitor, headsets);
    }
}
