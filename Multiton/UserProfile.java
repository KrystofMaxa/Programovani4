package Multiton;

import lombok.Data;

@Data
public class UserProfile {
    private String userId;
    private String jmeno;
    private String prijmeni;
    private String email;



    public UserProfile(String userId){
        this.userId = userId;
    }

}