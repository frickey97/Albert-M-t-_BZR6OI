package ElsoFeladat;

public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    private double alkoholTartalom;

    public ErjedtGyumolcs(double alkoholTartalom, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }      
    
    
    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }
    
    
}
