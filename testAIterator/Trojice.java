public class Trojice implements Iterable<String>{
    String a;
    String b;
    String c;
    public Trojice(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public IteratorTrojce iterator(){
//        IteratorTrojce it = new IteratorTrojce();
//        it.trojice = this;
//        return it;
        return new IteratorTrojce(this);
    }

    public static void main(String[] args) {
        Trojice t = new Trojice("po", "ut","ne");

        for(String s: t){
            for (String s2: t){
                System.out.println(s + "-" + s2);
            }
            //System.out.println(s);
        }
        IteratorTrojce it = t.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        IteratorTrojce it2 = t.iterator();

        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
