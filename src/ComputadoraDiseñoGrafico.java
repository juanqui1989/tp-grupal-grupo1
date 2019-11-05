//Clase concreta
public class ComputadoraDiseñoGrafico extends ArmarComputadora {
    @Override
    public void buildCrear() {
        compu = new Computadora();
        compu.setCooler(4);
        compu.setDisco(" Disco Solido SSD Adata 480GB SU630 520MB/s");
        compu.setGabinete("Gabinete Cooler Master Mastercase H500 RGB 2x200mm ARGB Fans E-ATX");
        compu.setMicroprocesador("Procesador Intel Core i7 9700KF 4.9GHz Turbo 1151 Coffee Lake");
        compu.setMotherboard("Mother ASUS ROG MAXIMUS XI FORMULA 9th Gen 1151 ");
        compu.setRam("Memoria Corsair DDR4 32GB (2x16GB) 3200MHz DOMINATOR PLATINUM RGB Black ");
        compu.setPlacaDeVideo("Pny Vcqgp100-pb Quadro Graphics Card");
        compu.setFuente("Fuente Gigabyte 750W 80 Plus Gold Modular G750H");
        compu.setMonitor(" Monitor LG 27\" VGA HDMI Full HD ");
    }
}
