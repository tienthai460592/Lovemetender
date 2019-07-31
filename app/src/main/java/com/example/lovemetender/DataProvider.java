package com.example.lovemetender;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<Location> locations;

    public DataProvider(){
        /**space for "{"*/
        this.locations= new ArrayList<Location>();

    }
    static {
        locations = new ArrayList<>();

        locations.add(new Location("ttt","ggh","gg","ggg"));
        locations.add(new Location("ttt","ggh","gg","ggg"));
        locations.add(new Location("ttt","ggh","gg","ggg"));
        locations.add(new Location("ttt","ggh","gg","ggg"));

        /**These items are set but not used, and why initialised in a static constructor?*/

    }
}
