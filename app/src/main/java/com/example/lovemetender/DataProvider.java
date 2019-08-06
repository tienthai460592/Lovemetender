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

        destinations.add(new Destination("Huis Vermeer", "Een warm welkom in Hotel Huis Vermeer. De voormalige bankierswoning van de familie Vermeer waar u Koninklijk kunt genieten. Thuis in Deventer.", "HOTEL", "24h"));
        destinations.add(new Destination("St Tropez", "St.Tropez aan de Brink brengt de warme sferen van de Franse Rivièra naar je toe! 7 dagen per week open: koffie, lunch, diner & meer.", "RESTAURANT", "8h - 19h"));
        destinations.add(new Destination("Boas", "Leverancier van speeltoestellen, parkmeubilair, multisportvelden en skatevoorzieningen. Specialist in reiniging van speelzand en kunststof ondergronden.", "HOTEL", "24h"));
        destinations.add(new Destination("Schiermonnikoog", "Op onze website vindt u informatie over de gemeente Schiermonnikoog, het bestuur en de organisatie, nieuws en de gemeentelijke producten en diensten.", "BEACH", "5h-17h"));


        /**These items are set but not used, and why initialised in a static constructor?*/

        locations.add(new Location("Deventer"));
        locations.add(new Location("Utretch"));
        locations.add(new Location("Amsterdam"));
        locations.add(new Location("Rotterdam"));
        locations.add(new Location("Enschede"));
        locations.add(new Location("Nijmegen"));

    }
}
