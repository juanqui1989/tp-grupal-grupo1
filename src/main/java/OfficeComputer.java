import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;

public class OfficeComputer implements Builder {
    private Case case1;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Headsets headsets;


    @Override
    public void buildMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void buildKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void buildMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void buildHeadsets(Headsets headsets) {
        this.headsets = headsets;
    }

    public Computer getResult(){
        return new Computer(case1, monitor, mouse, keyboard, headsets);
    }
}
