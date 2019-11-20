package ElsoFeladat;

public class Bor extends AlkoholosItal{
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return szoloFajta;
    }

    public String holTermett() {
        return termoTerulet;
    }
     
    @Override
    public String mibolKeszult() {
       return null;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }
    
}
