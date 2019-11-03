public class Cliente {
    /** Un cliente pidiendo un armado. */
    public static void main(String[]args){
      Tecnico tecnico = new Tecnico();
      PcGamer builder = new PcGamer();
      CaseGamer builder2 = new CaseGamer();
      tecnico.constructDeskoptGamer(builder);
      tecnico.constructCaseGamer(builder2);

      Computer computer = builder.getResult();
      Case caseGamer = builder2.getResult();

      computer.print();
      System.out.println(caseGamer.print());
      tecnico.precioTotal(computer, caseGamer);
    }
}
