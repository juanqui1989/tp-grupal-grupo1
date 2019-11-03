import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;

public interface Builder {
    void buildMonitor(Monitor monitor);
    void buildKeyboard(Keyboard keyboard);
    void buildMouse(Mouse mouse);
    void buildHeadsets(Headsets headsets);
}
