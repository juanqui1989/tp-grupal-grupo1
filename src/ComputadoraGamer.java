//Clase concreta
public class ComputadoraGamer extends ArmarComputadora {

    @Override
    public void buildCrear() {
       compu = new Computadora();
        compu.setCooler(5);
        compu.setDisco(" Disco Solido SSD Adata 480GB SU630 520MB/s");
        compu.setGabinete("Gabinete Cooler Master COSMOS C700M ARGB E-ATX");
        compu.setMicroprocesador("Procesador Intel Core i5 9600KF Turbo 1151 9th Gen Coffee Lake");
        compu.setMotherboard("Mother MSI H310M PRO-VDH PLUS");
        compu.setRam("Memoria Team DDR4 16GB 2666MHz T-Force Delta RGB White ");
        compu.setPlacaDeVideo("Placa de Video Zotac RTX 2080 Ti 11GB GDDR6 AMP MAXX");
        compu.setFuente("Fuente Thermaltake Smart BX1 750W RGB 80 Plus Bronze");
        compu.setMonitor("Monitor Gamer Viewsonic 25 XG2530 240Hz FreeSync ");
    }
}
