import Periféricos.Headsets;
import Periféricos.Keyboard;
import Periféricos.Monitor;
import Periféricos.Mouse;
import TiposDeComponentes.TipoComponente;

public class Cliente {
    /** Un cliente pidiendo un armado. */
    public static void main(String[]args){
        PcGamer pc1 = new PcGamer(new Monitor( new TipoComponente("Gammer"),200), new Keyboard(new TipoComponente("razer"),2000), new Mouse(new TipoComponente("Gamer"),3000),new Headsets(new TipoComponente("SteelSeries"),12000));
    }
}