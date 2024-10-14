package Tovarna;

public class MojeTovarna implements TovarnaNaTvary {

    @Override
    public Tvar vytobTvar(String tvar) {
        if (tvar.equals("Ctverec")) {
            return new Ctverec();
        } else if (tvar.equals("Obdelnik")) {
            return new Obdelnik();
        } else {
            throw new IllegalArgumentException("neznam tvar");
        }

    }
}
