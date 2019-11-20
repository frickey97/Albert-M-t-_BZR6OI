package ElsoFeladat;

public abstract class Gyumolcsle extends Ital{
    public Gyumolcsle(Gyumolcs gy){
    }
    
    public abstract String mibolFacsartak();
    
    public abstract String mibolKeszult();
    
    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }
    
}
