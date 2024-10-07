public class Jedinacek {
    private static Jedinacek singletonInstance;
    public int counter = 0;
    private Jedinacek() { }

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }
}