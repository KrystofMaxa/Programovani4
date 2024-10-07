public class UkolB {
    public UkolB(int n) {
        for(int i = n; i > 0; i = i/2) {
            metodaB(i);
        }
    }

    public void metodaB(int n) {
        if (n > 2) {
            metodaC();
        }

        Jedinacek jedinacek = Jedinacek.getInstance();
        jedinacek.counter++;
    }

    public void metodaC() {
        Jedinacek jedinacek = Jedinacek.getInstance();
        jedinacek.counter++;
    }
}