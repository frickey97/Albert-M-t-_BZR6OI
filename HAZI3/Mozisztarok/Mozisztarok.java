package Mozisztarok;

import java.util.*;

public class Mozisztarok
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Filmek> lista = new ArrayList();

        while(sc.hasNextLine())
        {
            String[] sor = sc.nextLine().split(":");
            String[] filmcime = sor[0].split(" \\(");
            String[] evszam = filmcime[1].split("\\)");
            String[] szereplok = sor[1].split(",");

            for (int i = 0; i < szereplok.length; i++)
            {
                Filmek a = new Filmek(szereplok[i]);

                if(!lista.contains(a))
                {
                    lista.add(a);
                    int index = lista.indexOf(a);
                    lista.get(index).setDb(lista.get(index).getDb() + 1);
                    lista.get(index).getMap().put(filmcime[0],Integer.parseInt(evszam[0]));
                }else
                {
                    int index = lista.indexOf(a);
                    lista.get(index).setDb(lista.get(index).getDb() + 1);
                    lista.get(index).getMap().put(filmcime[0],Integer.parseInt(evszam[0]));
                }
            }
        }
        Collections.sort(lista);

        for(Filmek item: lista)
        {
            System.out.println(item);
        }

    }
}

class Filmek implements Comparable<Filmek>
{
    private String szereplonev;
    private int db;
    private SortedMap<String, Integer> map;

    public Filmek(String szereplonev) {
        this.szereplonev = szereplonev;
        this.db = 0;
        this.map = new TreeMap();
    }

    public String getSzereplonev() {
        return szereplonev;
    }

    public void setSzereplonev(String szereplonev) {
        this.szereplonev = szereplonev;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.szereplonev).append("\n");

        int lefutott = 0;

        Map<String, Integer> result2 = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        int db = 0;
        if(lefutott == 0)
        {
            for(SortedMap.Entry<String, Integer> item: result2.entrySet())
            {
                if(db < this.map.size() -1)
                    sb.append(item.getValue()).append(": ").append(item.getKey()).append("\n");
                else
                    sb.append(item.getValue()).append(": ").append(item.getKey());
                db++;
            }

            lefutott = 1;

            return sb.toString();
        }else
        {
            for(SortedMap.Entry<String, Integer> item: result2.entrySet())
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

        return this.szereplonev.equals(f.getSzereplonev());
    }

    @Override
    public int compareTo(Filmek filmek) {
        if(this.db == filmek.getDb())
        {
            return this.szereplonev.compareTo(filmek.getSzereplonev());
        }
        return filmek.db - this.db;
    }
}

