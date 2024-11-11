import java.util.ArrayList;

public class MojeVlaknoMain {
    public static void main(String[] args) throws InterruptedException {
//        MojeVlakno v1 = new MojeVlakno();
//        Thread tr1 = new Thread(v1);

//        MojeVlakno v2 = new MojeVlakno();
//        Thread tr2 = new Thread(v2);
//        POMOCI ANONYM TRIDY

        ArrayList<Integer> arr = new ArrayList<>();
        Runnable v1 = new MojeVlakno(); //vlakno implementuje runnable
        Thread tr1 = new Thread(v1);

        Runnable v2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 'a'; i<='z'; i++){
                    arr.add(i);
                }
            }
        };
        Thread tr2 = new Thread(v2);

//        Runnable v3 = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = -1; i>=-99; i--){
//                    System.out.println(i);
//                }
//            }
//        };
//        Thread tr3 = new Thread(v3);
        //nemusime psat jmeno metody kdyt jde jen o jednu vec
//        Runnable v3 = () -> {for(int i = -1; i>=-99; i--){System.out.println(i);}};
//        Thread tr3 = new Thread(v3);

        //jde to napsaat jeste rychleji a to jako parametr
        Thread tr3 = new Thread(() -> {for(int i = -1; i>=-99; i--){System.out.println(i);arr.add(i);}});

        tr1.start();
        tr2.start();
        tr3.start();
        tr2.join();
        tr3.join();
        System.out.println(arr);
    }
}
