package peteDevillish.RidesharingDemo.Users;

import peteDevillish.RidesharingDemo.Locality;

import java.util.List;

public class User {
    private String from;
    private String to;
    //private List<Locality> localities;

    public User() {
    }

    public User(String from, String to) {
        this.from = from;
        this.to = to;
       // this.localities = localities;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

//    public List<Locality> getLocalities() {
//        return localities;
//    }
//
//    public void setLocalities(List<Locality> localities) {
//        this.localities = localities;
//    }
}
