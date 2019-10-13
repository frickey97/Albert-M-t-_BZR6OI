package Iskola;

import java.util.Objects;

public class Ora extends Orarend {
    public int id;
    public String neve;
    public int ora_kezdete;

    public Ora(int id, String neve, int ora_kezdete) {
        this.id = id;
        if(ora_kezdete > 19 || ora_kezdete < 8)
        {
            this.ora_kezdete = 8;
        }else
        {
            this.ora_kezdete = ora_kezdete;
        }
        this.neve = neve;
    }

    public Ora(String nap, int id, String neve, int ora_kezdete) {
        super(nap);
        if(ora_kezdete > 19 || ora_kezdete < 8)
        {
            this.ora_kezdete = 8;
        }else
        {
            this.ora_kezdete = ora_kezdete;
        }
        this.id = id;
        this.neve = neve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public int getOra_kezdete() {
        return ora_kezdete;
    }

    public void setOra_kezdete(int ora_kezdete) {
        this.ora_kezdete = ora_kezdete;
    }

    @Override
    public String toString() {
        return "Ora{" +
                "id=" + id +
                ", neve='" + neve + '\'' +
                ", ora_kezdete=" + ora_kezdete +
                '}';
    }

}
