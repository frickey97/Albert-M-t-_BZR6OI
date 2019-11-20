package Mozisztarok2;

import java.util.*;

public class Mozisztarok2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Filmek> lista = new ArrayList();

        while(sc.hasNextLine())
        {
            String[] sor = sc.nextLine().split(":");
            String[] nev = sor[0].split(" \\(");
            String[] evszam = nev[1].split("\\)");
            String[] filmcimek = sor[1].split(";");

            for (int i = 0; i < filmcimek.length; i++)
            {
                Filmek a = new Filmek(filmcimek[i]);

                if(lista.contains(a))
                {
                    int index = lista.indexOf(a);
                    lista.get(index).setDb(lista.get(index).getDb() + 1);
                    if(!lista.get(index).getMap().containsKey(nev[0]))
                    {
                        lista.get(index).getMap().put(nev[0],Integer.parseInt(evszam[0]));
                    }
                }else
                {
                    lista.add(a);
                    int index = lista.indexOf(a);
                    lista.get(index).setDb(lista.get(index).getDb() + 1);
                    lista.get(index).getMap().put(nev[0],Integer.parseInt(evszam[0]));
                }

            }
        }

        Collections.sort(lista);

        int i = 0;
        for(Filmek item: lista)
        {
            System.out.println(item);

        }
    }
}

class Filmek implements Comparable<Filmek>
{
    private String filmcim;
    private int db;
    private SortedMap<String,Integer> map;

    public Filmek(String filmcim) {
        this.filmcim = filmcim;
        this.map = new TreeMap();
        this.db = 0;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public void setFilmcim(String filmcim) {
        this.filmcim = filmcim;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public SortedMap<String, Integer> getMap() {
        return map;
    }

    public void setMap(SortedMap<String, Integer> map) {
        this.map = map;
    }

    int mukodott = 0;

    @Override
    public String toString() {
        if(mukodott == 0)
        {
            StringBuilder sb = new StringBuilder();

            sb.append(this.filmcim).append("\n");

            Map<String, Integer> result2 = new LinkedHashMap<>();
            map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
            int db = 0;

            for(Map.Entry<String, Integer> item : result2.entrySet())
            {

                if(db < this.map.size() -1)
                    sb.append(item.getValue()).append(": ").append(item.getKey()).append("\n");
                else
                    sb.append(item.getValue()).append(": ").append(item.getKey());
                db++;
            }
            mukodott = 1;
            return sb.toString();
        }else
        {
            StringBuilder sb = new StringBuilder();

            sb.append(this.filmcim).append("\n");

            Map<String, Integer> result2 = new LinkedHashMap<>();
            map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
            int db = 0;

            for(Map.Entry<String, Integer> item : result2.entrySet())
            {

                if(db < this.map.size() -1)
                    sb.append(item.getValue()).append(": ").append(item.getKey()).append("\n");
                else
                    sb.append(item.getValue()).append(": ").append(item.getKey());
                db++;
            }
            return sb.toString();
        }
    }


    @Override
    public boolean equals(Object o) {
        if(null == o || !(o instanceof Filmek))
            return false;

        Filmek f = (Filmek)o;

        return this.filmcim.equals(f.getFilmcim());
    }

    @Override
    public int compareTo(Filmek obj) {
        if(this.db == obj.getDb())
        {
            return this.filmcim.compareTo(obj.getFilmcim());
        }
        return obj.getDb() - this.db;

    }
}