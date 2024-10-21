package Multiton;

import java.util.HashMap;

public class MujMultiton {
//     private static UserProfile singletonInstance;
    private static HashMap<String, UserProfile> instances;
    private MujMultiton() { }

    public static UserProfile getInstance(String key) {
        if (instances == null){
            instances = new HashMap<>();
        }

        if (instances.containsKey(key) == false){
            instances.put(key, new UserProfile(key));
        }
        return instances.get(key); // pridame ten key
    }

    public static void main(String[] args) {
        UserProfile user1 = MujMultiton.getInstance("user1");
        UserProfile user2 = MujMultiton.getInstance("user2");

        System.out.println("1:" + user1);
        System.out.println("1:" + user2.toString());
        System.out.println("1=2?" + (user1==user2));


    }
}
