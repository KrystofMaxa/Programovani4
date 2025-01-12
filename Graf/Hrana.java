package Graf;

public class Hrana {
    Vrchol v1;
    Vrchol v2;

    public Hrana(Vrchol v1, Vrchol v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Hrana{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
