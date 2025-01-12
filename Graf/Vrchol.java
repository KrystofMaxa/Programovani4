package Graf;

import java.util.ArrayList;

/**
 * trida reprezentujici jeden vrchol grafu a pamatuje si vrcholy, se kterymi
 * sousedi
 */
public class Vrchol {
    String jmeno;
    ArrayList<Vrchol> sousedi = new ArrayList<Vrchol>();
    Vrchol(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "Vrchol{" +
                "jmeno='" + jmeno + '\'' +
                '}';
    }

    /**
     * pridej vrchol `v` do seznamu sousednich vrcholu
     */
    //hotovo
    public void pridejSouseda(Vrchol v) {
        Boolean obashuje = false;
        for (int i = 0; i < sousedi.size(); i++) {
            if (sousedi.get(i).jmeno.equals(v.jmeno)){
                obashuje = true;
            }
        }
        if (obashuje==false){
            sousedi.add(v);
        }else{
            System.out.println("Souseda " + v + "jiz obsahuje");
        }
    }

    /**
     * otestuje, zda je vrchol `v` mym sousdem
     *
     * @return true pokud je v mym primym sousedem
     */
    //hotovo
    public boolean jeSousedem(Vrchol v) {
        if (sousedi.contains(v)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * otestuje, zda existuje cesta mezi mnou a vrcholem `v`
     *
     * @return true pokud cesta existuje
     */
    public boolean existujeCestaDo(Vrchol v) {

    }
}