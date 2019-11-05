//Clase concreta
public class ComputadoraHogareña  extends ArmarComputadora{
    @Override
    public void buildCrear() {
        compu = new Computadora();
        compu.setCooler(1);
        compu.setDisco("Disco Rígido Seagate 1TB Barracuda 64MB SATA 6GB/s");
        compu.setGabinete("Gabinete Sentey X10 Ventana Acrilica M-ATX RGB");
        compu.setMicroprocesador("Procesador Intel Celeron G3930 2.9 GHZ LGA 1151 Kaby Lake ");
        compu.setMotherboard("Mother ASUS PRIME H110M-P 1151 HDMI M.2 ");
        compu.setRam("Memoria Adata DDR4 4GB 2666MHz Value ");
        compu.setPlacaDeVideo("Intel® HD Graphics 610");
        compu.setFuente("Fuente LNZ 550W Black Mod SX550-FS ");
        compu.setMonitor("Monitor LG LED 19'' 19M38A-B VGA");
    }
}
