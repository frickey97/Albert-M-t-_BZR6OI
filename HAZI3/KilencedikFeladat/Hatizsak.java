package KilencedikFeladat;

public class Hatizsak implements Comparable<Hatizsak>
{
    private String marka;
    private double urtartalom;
    private int zsebekszama;
    private boolean pvizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekszama, boolean pvizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekszama = zsebekszama;
        this.pvizhatlan = pvizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekszama() {
        return zsebekszama;
    }

    public boolean isPvizhatlan() {
        return pvizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak{" +
                "marka='" + marka + '\'' +
                ", urtartalom=" + urtartalom +
                ", zsebekszama=" + zsebekszama +
                ", pvizhatlan=" + pvizhatlan +
                '}';
    }

    @Override
    public int compareTo(Hatizsak obj) {
        if(this.marka.equals(obj.marka))
            return this.zsebekszama - obj.zsebekszama;
        return this.marka.compareTo(obj.marka);
    }
}
