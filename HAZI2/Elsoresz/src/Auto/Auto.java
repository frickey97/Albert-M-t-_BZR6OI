package Auto;

import java.util.Date;

public class Auto {
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasDatuma = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", motorTeljesitmeny=" + motorTeljesitmeny +
                ", gyartasDatuma=" + gyartasDatuma +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Teherauto extends Auto
{
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto{" +
                "maxSzallithatoTeher=" + maxSzallithatoTeher +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
