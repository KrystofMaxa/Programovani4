package PrvniHodina;

public class Bublinky {
    private int[] arr;

    public Bublinky(int[] arr) {
        this.arr = arr;
    }

    /** vrati setrizene pole **/
    public int[] getArr() {
        return arr;
    }
    /** setridi nase pole  @arr **/
    public void setrid(){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[i-1]>arr[j]){
                    prohod(i-1,i);
                }

            }
        }
    }

    /**
     * prohod prvek
     * @param i s prvnkem
     * @param j
     * z pole @arr
     */
    protected void prohod(int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }
}
