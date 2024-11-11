import java.util.Iterator;

public class IteratorTrojce implements Iterator<String> {
    int pocet;
    Trojice trojice;
    public boolean hasNext(){
        return pocet < 3;
    }

    public IteratorTrojce(Trojice trojice) {
        this.trojice = trojice;
    }

    public String next(){
        switch (pocet++){
            case 0: return trojice.a;
            case 1: return trojice.b;
            default: return trojice.c;
        }
    }
}
