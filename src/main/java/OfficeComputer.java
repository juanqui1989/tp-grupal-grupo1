import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;

public class OfficeComputer  {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Headsets headsets;

    public OfficeComputer(Monitor monitor, Keyboard keyboard, Mouse mouse, Headsets headsets) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.headsets = headsets;
    }
}