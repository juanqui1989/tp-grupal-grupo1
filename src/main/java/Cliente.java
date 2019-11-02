public class Cliente {
    /** Un cliente pidiendo un armado. */
    public static void main(String[]args){

        Tecnico tecnico=new Tecnico();
        PcBuilder notebook=new Notebook();

        tecnico.setPcBuilder(notebook);
        tecnico.construirPc();
    }

}
