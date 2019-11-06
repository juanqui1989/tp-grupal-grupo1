import Componentes.Cpu;
import TipoComponentes.TiposDeComponentes;

public class Cliente {
    /** Un cliente pidiendo un armado. */
    public static void main(String[]args){
        Tecnico tecnico = new Tecnico();

        tecnico.constructDeskoptGamer();
        tecnico.constructCaseGamer();


    }
}