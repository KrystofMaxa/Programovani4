import java.util.Arrays;

public class MojeIntPole {
        private final int[] arr;
        int j = -1;

    public MojeIntPole(int[] polozka){
        this.arr = new int[1];
        this.arr[0] = 1;

    }

    @Override
    public String toString() {
        return "MojeIntPole{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public MojeIntPole add(int novaPolozka){
        int[] noveArr = Arrays.copyOf(arr,arr.length+1);
        noveArr[arr.length] = novaPolozka;
        return new MojeIntPole(noveArr);
    }
//    public boolean hasNext(int i){
public static void main(String[] args) {
    int[] vstup = {13};
    MojeIntPole x = new MojeIntPole(vstup);
    x.add(68);x.add(5);



    System.out.println(x.next());
    System.out.println(x.next());

//    System.out.println(x);
    //System.out.println(y);
}
    //        if(arr[j+2]!=null){
//            return true;
//        }else return false;
//
//    }
    public int next(){
        j = j + 1;
        System.out.println(j);
        System.out.println(arr[j]);
        return arr[j];
    }
}
