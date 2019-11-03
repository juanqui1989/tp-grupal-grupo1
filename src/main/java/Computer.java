import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;

public class Computer {

    private Case case1;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private Headsets headsets;

    public Computer(Case case1, Monitor monitor, Mouse mouse, Keyboard keyboard, Headsets headsets) {
        this.case1 = case1;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.headsets = headsets;
    }

    public void print(){
        System.out.println("Monitor " + monitor.getTipo() + ": $" +  monitor.getPrecio());
        System.out.println("Mouse " + mouse.getTipo()  + ": $" +  mouse.getPrecio());
        System.out.println("Keyboard " + keyboard.getTipo() + ": $" +  keyboard.getPrecio());
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

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(Keyboard teclado) {
        this.keyboard = teclado;
    }

    public Case getCase() {
        return case1;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Headsets getHeadsets() { return headsets; }

    public Keyboard getKeyboard() { return keyboard; }

    public Mouse getMouse() {
        return mouse;
    }
}
