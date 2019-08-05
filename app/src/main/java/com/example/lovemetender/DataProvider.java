package com.example.lovemetender;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<Destination> destinations;
    public static ArrayList<Location> locations;

    public DataProvider() {
        /**space for "{"*/
        this.destinations = new ArrayList<Destination>();
        this.locations = new ArrayList<Location>();

    }

    static {
        destinations = new ArrayList<>();
        locations = new ArrayList<>();

        destinations.add(new Destination("ttt", "ggh", "gg", "ggg"));
        destinations.add(new Destination("ttt", "ggh", "gg", "ggg"));
        destinations.add(new Destination("ttt", "ggh", "gg", "ggg"));
        destinations.add(new Destination("ttt", "ggh", "gg", "ggg"));


        /**These items are set but not used, and why initialised in a static constructor?*/

        locations.add(new Location("Iowa", new Weather(28, "intense sun")));
        locations.add(new Location("Ibiza", new Weather(28, "intense sun")));

    }
}
