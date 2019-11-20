package ElsoFeladat;

public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }

    public String milyenFajta() {
        return fajta;
    }

    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return "Gyumolcs{" + "fajta=" + fajta + ", iz=" + iz + '}';
    }
}
