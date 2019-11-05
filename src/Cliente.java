public class Cliente {
    public static void main(String[] args) {
        Tecnico director = new Tecnico();
        director.setComputadora(new ComputadoraGamer());
        director.crearComputadora();
        Computadora computadoraProducto = director.getComputadora();
        System.out.println("Su computadora tiene:"+
     "Gabinete: "+           computadoraProducto.getGabinete()+
      "Motherboard: "+       computadoraProducto.getMotherboard()+
      "Procesador: " +       computadoraProducto.getMicroprocesador()+
       "Placa de video: " +  computadoraProducto.getPlacaDeVideo()+
        "Fuente: " +         computadoraProducto.getFuente()+
         "Disco: " +         computadoraProducto.getDisco()+
          "Ram: " +          computadoraProducto.getRam()+
           "Cantidad de coolers: " +  computadoraProducto.getCooler()+
            "Monitor: " +   computadoraProducto.getMonitor());
    }

}
