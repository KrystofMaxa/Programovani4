package Tovarna;

public class PlotrTovarna implements TovarnaNaTvary{

    @Override
    public Tvar vytobTvar(String tvar) {
        if (tvar.equals("Ctverec")){
            return new VyrezCtverec();
        }else if (tvar.equals("Obdelnik")){
            return new VyrezCtverec();
        }else{
            throw new IllegalArgumentException("neznam tvar");
        }
    }
}
