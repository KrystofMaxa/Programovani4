//Tahle trida je genericky typ, muzeme menit co tam bude
//VSichni jsou typu object
//A je cokoliv, ale musi to umet CompareTo => Mohu delat ty trojice jen z toho co to umi
//Musel buch user profilu pridat metodu compareTo
//comaparable je taky genericky typ
package Multiton;

public class MojeTrojice<A extends Comparable<A>> {
    private A arg1;
    private A arg2;
    private A arg3;

    public MojeTrojice(A arg1, A arg2, A arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    @Override
    public String toString() {
        return "MojeTrojice{" +
                "arg1='" + arg1 + '\'' +
                ", arg2='" + arg2 + '\'' +
                ", arg3='" + arg3 + '\'' +
                '}';
    }

    public void setAll(A a){
        arg1 = arg2 = arg3 = a;
    }

    public A getArg1() {
        return arg1;
    }

    public A getMin(){
        if (arg1.compareTo(arg2)>0
                && arg1.compareTo(arg3)>0)
            return arg1;
        if (arg2.compareTo(arg3)>0)
            return arg2;
        return arg3;
    }

    public static void main(String[] args) {
        MojeTrojice<String> t = new MojeTrojice<>("a","b","c");
        MojeTrojice<Integer> v = new MojeTrojice<>(1,2,3);

        //MojeTrojice<UserProfile> pp = new MojeTrojice<>(null,null,null);

        System.out.println(t);
        System.out.println(v);
        v.setAll(1);
        t.setAll("A");

        String s = t.getArg1();
        System.out.println(s);
        System.out.println(t);

        MojeTrojice v1 = new MojeTrojice(1,"a",3);
        System.out.println(v1);

    }
}
