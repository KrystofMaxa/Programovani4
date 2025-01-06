package PrvniHodina;

import static org.junit.jupiter.api.Assertions.*;

class BublinkyTest {

    @org.junit.jupiter.api.Test
    void getArr() {
    }

    @org.junit.jupiter.api.Test
    void setrid() {
//        int[] vstup = { 13, 12, 124 , 0, 1, 2};
//        int[] vystup = { 0, 1, 2, 12, 13, 124 };
        int[] vstup = { 12,1 ,4,1, 122, 32, 0, 2};
        int[] vystup = { 0, 1, 1, 2, 4, 12, 32, 122};

        Bublinky b = new Bublinky(vstup);
        b.setrid();

        assertArrayEquals(vystup, b.getArr());

    }

    @org.junit.jupiter.api.Test
    void prohod() {
        int[] vstup = { 0, 1, 2 };
        int[] vystup = { 1, 0, 2};
        Bublinky b = new Bublinky(vstup);

        b.prohod(0,1);
//        if (b.getArr()[0]== 1 && b.getArr()[1]==0){
//            a
//        }
//

        assertTrue(b.getArr()[0]== 1 && b.getArr()[1]==0); //tohle ma byt pravda
        assertArrayEquals(vystup, b.getArr());
    }
}