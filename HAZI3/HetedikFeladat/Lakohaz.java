package HetedikFeladat;

public class Lakohaz implements Comparable<Lakohaz>{
    public static final double emeletMagassag = 3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter()
    {
        return this.alapterulet * emeletMagassag * this.emeletekSzama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb = sb.append(this.cim).append(": ").append(this.emeletekSzama).append(" ").append(this.alapterulet);
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakohaz obj) {
        if(this.legkobmeter()<obj.legkobmeter())
        {
            return 1;
        }    
        else if(this.legkobmeter()>obj.legkobmeter()){
            return -1;
        }
        return 0;
    }
    
}
