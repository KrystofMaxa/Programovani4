package Tovarna;

import java.util.ArrayList;
import java.util.Scanner;

public class TvarovyEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String a = sc.next();
        ArrayList<Tvar> arr =  new ArrayList<Tvar>();
        TovarnaNaTvary t = new PlotrTovarna(); //new MojeTovarna();
        // t.vytobTvar(a);

        for (;;){
            String slovo = sc.next();
            if (slovo.equals("konec")){
                break;
            }
            Tvar tvar = t.vytobTvar(slovo);
            arr.add(tvar);
        }

        for (Tvar r : arr){
            System.out.println(r.getClass().getSimpleName());
            System.out.println(r.namalujSe());
            System.out.println();
        }
    }
}
