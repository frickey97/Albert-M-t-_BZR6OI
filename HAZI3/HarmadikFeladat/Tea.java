package HarmadikFeladat;

public class Tea implements Rendezheto<Tea>{
        public String nev;
        public int ar;
        
        public Tea(String s,int j) {
          this.nev=s;
          this.ar=j;
        }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public boolean egyenlo(Tea o) {
    return this.ar==o.getAr();
    }

    @Override
    public boolean nagyobbMint(Tea o) {
    return this.ar>o.getAr();
    }

    @Override
    public boolean kisebbMint(Tea o) {
    return this.ar<o.getAr();
    }
}