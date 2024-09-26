package com.example.lovemetender;

import java.util.ArrayList;

public class DataProvider {

    public ArrayList<Destination> destinations;

    public ArrayList<Location> locations;

    public DataProvider() {

        this.destinations = new ArrayList<Destination>();
        this.locations = new ArrayList<Location>();
        addDestination();
        addLocation();

    }


    public ArrayList<Destination> getDestinations() {

        return destinations;

    }

    public ArrayList<Location> getLocations() {

        return locations;

    }

    private void addDestination() {

        destinations.add(new Destination("Huis Vermeer", "Een warm welkom in Hotel Huis Vermeer. De voormalige bankierswoning van de familie Vermeer waar u Koninklijk kunt genieten. Thuis in Deventer.", "HOTEL", "24h"));
        destinations.add(new Destination("St Tropez", "St.Tropez aan de Brink brengt de warme sferen van de Franse Rivièra naar je toe! 7 dagen per week open: koffie, lunch, diner & meer.", "RESTAURANT", "8h - 19h"));
        destinations.add(new Destination("Boas", "Leverancier van speeltoestellen, parkmeubilair, multisportvelden en skatevoorzieningen. Specialist in reiniging van speelzand en kunststof ondergronden.", "HOTEL", "24h"));
        destinations.add(new Destination("Schiermonnikoog", "Op onze website vindt u informatie over de gemeente Schiermonnikoog, het bestuur en de organisatie, nieuws en de gemeentelijke producten en diensten.", "BEACH", "5h-17h"));

    }

    private void addLocation() {

        locations.add(new Location("Deventer"));
        locations.add(new Location("Utretch"));
        locations.add(new Location("Amsterdam"));
        locations.add(new Location("Rotterdam"));
        locations.add(new Location("Enschede"));
        locations.add(new Location("Nijmegen"));

    }

}
