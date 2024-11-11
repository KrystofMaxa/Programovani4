import java.util.Iterator;

public class Trojice implements Iterable<String>{
    String a;
    String b;
    String c;
    public Trojice(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public Iterator<String> iterator() {
//        return new IterniIterator(this);
        return new Iterator<String>() {
            int pocet;

            public boolean hasNext() {
                return pocet < 3;
            }

            public String next() {
                switch (pocet++) {
                    case 0: return a;
                    case 1: return b;
                    default: return c;
                }
            }
        };
    }

    //Vnitrni trida ? Vnorena trida  co dela , co znamena iterovat to je to prochazeni
    //nepotrebuje konstruktor a ani jmeno
//    class IterniIterator implements Iterator<String> {
//        int pocet;
//        Trojice trojice;
//        public boolean hasNext(){
//            return pocet < 3;
//        }
//
//        public IterniIterator(Trojice trojice) {
//            this.trojice = trojice;
//        }
//
//        public String next(){
//            switch (pocet++){
//                case 0: return a;
//                case 1: return b;
//                default: return c;
//            }
//        }
//    }

    public static void main(String[] args) {
        Trojice t = new Trojice("po", "ut","ne");

        for(String s: t){
            for (String s2: t){
                System.out.println(s + "-" + s2);
            }
            //System.out.println(s);
        }
//        IteratorTrojce it = t.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        IteratorTrojce it2 = t.iterator();
//
//        while (it2.hasNext()){
//            System.out.println(it2.next());
//        }
    }
}
