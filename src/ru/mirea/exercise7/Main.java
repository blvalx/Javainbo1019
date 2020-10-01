package ru.mirea.exercise7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(1,10);
        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();
////////////////////////////////// Dog///////////////////////////////////////////
        Dog akitaInu = new AkitaInu(8,26,"Акита");
        Dog korgi = new Korgi(5,11,"Корги");

        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(akitaInu);
        allDogs.add(korgi);

        for (Dog a: allDogs)
            a.Bark();

        ((Korgi)korgi).Play();
    }
}
