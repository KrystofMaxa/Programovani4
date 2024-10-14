package Tovarna;

public class Obdelnik implements Tvar {
    public String namalujSe(){
        return "Ja jsem obdelnik" + "\n*****\n*****\n*****\n*****";
    }

    public double plocha(){
        return 16;
    }
}
