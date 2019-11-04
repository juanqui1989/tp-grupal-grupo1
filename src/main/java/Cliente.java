
public class Cliente {
    /** Un cliente pidiendo un armado. */
    public static void main(String[]args){
        Tecnico tecnico = new Tecnico();
        PcGamer gamer = new PcGamer();
        CaseGamer gamer2 = new CaseGamer();

        tecnico.constructDeskoptGamer();
        tecnico.constructCaseGamer();

        Computer computer = gamer.getResult();
        Case caseGamer = gamer2.getResult();

        computer.print();
        System.out.println(caseGamer.print());
        tecnico.precioTotal(computer, caseGamer);
    }
}