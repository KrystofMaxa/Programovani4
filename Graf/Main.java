package Graf;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        var g = new Graf();
//        var v1 = g.dejVrchol("v1");
//        var v2 = g.dejVrchol("v2");
//        var v3 = g.dejVrchol("v3");
//
//        v1.pridejSouseda(v2);
//        v2.pridejSouseda(v3);
//
//        if (v1.existujeCestaDo(v3) == false) {
//            System.out.println("je to rozbite!!");
//        } else {
//            g.ulozGrafDoSouboru("graf.dat");
//        }
        var g = new Graf("C:\\Users\\kryst\\Downloads\\RocnikovePraceArabska-main\\RocnikovePraceArabska-main\\Ukoly\\src\\Graf\\Graf");

        var v1 = g.dejVrchol("Karel");
        System.out.println(v1.sousedi);
        var v3 = g.dejVrchol("v3");

//
//        ArrayList<Vrchol> vrchols = new ArrayList<>();
//        Vrchol vrchol1 =  new Vrchol("KAREL");
//        Vrchol vrchol2 = new Vrchol("JAN");
//        vrchols.add(vrchol2);vrchols.add(vrchol1);
//        Vrchol vrchol3 = new Vrchol("KAREL");
//
//        for (int i = 0; i < vrchols.size(); i++) {
//            if(vrchols.get(i).jmeno.equals(vrchol3.jmeno));
//            System.out.println("ANO");
//        }
    }
}
