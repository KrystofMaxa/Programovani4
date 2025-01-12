package Graf;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * trida reprezentujici graf
 */
public class Graf {

//ArrayList<Hrana> hrany = new ArrayList<Hrana>();
    HashMap<Vrchol, Vrchol> hrany = new HashMap<Vrchol, Vrchol>();
    HashMap<String, Vrchol> vrcholHashMap = new HashMap<String, Vrchol>();


    ArrayList<Vrchol> vrcholy = new ArrayList<Vrchol>();;

    /**
     * vytvor novy prazdny Graf
     */
    public Graf() {

    }

    /**
     * nacti Graf ulozeny do souboru
     *
     *  soubor s grafem ulozenym pomoci metody [#ulozGrafDoSouboru]
     */
    public Graf(String jmenoSouboru) throws FileNotFoundException {
        File file = new File(jmenoSouboru);
        Scanner scanner = new Scanner(file);


            int pocetVrcholu = scanner.nextInt();
            for (int i = 0; i < pocetVrcholu; i++) {
                String jmenoVrcholu = scanner.next();
                Vrchol vrchol = new Vrchol(jmenoVrcholu);
                vrcholy.add(vrchol);
                vrcholHashMap.put(vrchol.jmeno, vrchol);
            }
            while(scanner.hasNext()){
                Vrchol ja = vrcholHashMap.get(scanner.next());
                Vrchol soused = vrcholHashMap.get(scanner.next());
                ja.sousedi.add(soused);
                soused.sousedi.add(ja); // a jsme sousede

            //prace navic mozna
                hrany.put(ja,soused);
        }
            //pridat sousedy vrcholum
    }

    /**
     * vrati Vrchol grafu podle jmena.
     *
     * Pokud vrchol s timto jmenem jeste neexistuje, vytvori novy. Pokud uz
     * existuje,
     * vrati jiz existujici.
     *
     * @return vrchol s danym jmenem
     */
    public Vrchol dejVrchol(String jmeno) {
        if(vrcholHashMap.containsKey(jmeno)){
            return vrcholHashMap.get(jmeno);
        }else {
            vrcholHashMap.put(jmeno, new Vrchol(jmeno));
            vrcholy.add(new Vrchol(jmeno));
        }
        return null;

    }

    /**
     * ulozi existujici graf do souboru.
     */
    public void ulozGrafDoSouboru(String jmenoSouboru) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(jmenoSouboru))) {
            oos.writeObject(this);
        }
    }
}