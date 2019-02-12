package peteDevillish.RidesharingDemo.Users;

import peteDevillish.RidesharingDemo.Locality;

import java.util.List;

public class Driver extends User {
    private String car;
    private int openSeats;


    public Driver(String car, int openSeats) {
        this.car = car;
        this.openSeats = openSeats;
    }

    public Driver(String from, String to, String car, int openSeats) {
        super(from, to);
        this.car = car;
        this.openSeats = openSeats;
    }
}
