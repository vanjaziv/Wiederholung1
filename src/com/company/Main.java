package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        printWeather("cold");
        String condition = "sunny";
        printWeather(condition);
        System.out.println(buildWeatherText("warm"));
        String text = buildWeatherText("freezing");
        System.out.println(text);
        String myString1 = new String("Etwas");
        String myString2 = new String("Etwas");
        boolean sameObject = myString1.equals(myString2);
        System.out.println("same object? " +sameObject);
        boolean sameValue = myString1.equals(myString2);
        System.out.println("same value? " +sameValue);
        boolean binAmCampus = true;
        if (binAmCampus) {
            System.out.println("Toller Tag");
        }
        int fuellStand = 0;
        int warnenAb = 5;
        if (fuellStand >= warnenAb) {
            System.out.println("tank wird leer");
        }

        if(fuellStand > warnenAb) {
            System.out.println("Genug Treibstoff");
        } else {
            System.out.println("kritische Tankmenge!");
        }
        String tag = "Sonntag";
        String zeit = "Nacht";
        if ((tag.equals("Sonntag")
                || tag.equals("Samstag"))
                && zeit.equals("Nacht")) {
            System.out.println("WE-Nacht-Tarif!");
        }
        int i = 0;
        while (i < 10) {
            System.out.println("Ergebnis: " + i);
            i = i + 1;
        }
    }

    private static void printWeather(String weather) {
        System.out.println("The weather is " + weather);
    }
    public static String buildWeatherText(String weather) {
        return "It's " + weather;
    }



}
