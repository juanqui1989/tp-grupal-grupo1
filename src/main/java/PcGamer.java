import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;

public class PcGamer {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Headsets headsets;

    public PcGamer(Monitor monitor, Keyboard keyboard, Mouse mouse, Headsets headsets) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.headsets = headsets;
    }

    public Computer getResult(){
        return new Computer(monitor, mouse, keyboard, headsets);
    }
}
