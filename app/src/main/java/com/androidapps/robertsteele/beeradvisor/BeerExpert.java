package com.androidapps.robertsteele.beeradvisor;

public class BeerExpert {

    private static final String[] lightBeers = {"stella", "peroni", "miller light", "bud light"};

    private static final String[] amberBeers = {"coors", "budweiser", "coors original", "amber beer"};

    private static final String[] darkBeers = {"Guinness", "Stout", "Dark beer"};

    private static final String[] brownBeers = {"Bass", "Ale", "New Castle", "brown beer"};

    public static String[] getBeers(String beerType) {
        String[] array;
        switch (beerType) {
            case "Dark":
                array = darkBeers;
                break;
            case "Light":
                array = lightBeers;
                break;
            case "Amber":
                array = amberBeers;
                break;
            case "Brown":
                array = brownBeers;
                break;
            default:
                array = new String[]{};
        }
        return array;
    }


}
