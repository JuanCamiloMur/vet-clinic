package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDate theFourthOfJuly;
    private final String breed;
    private final String color;
    private final String favoriteFood;
    private String favoriteToy;

    public Dog(String name, LocalDate theFourthOfJuly, String breed, String color, String favoriteFood, String favoriteToy) {
        this.name = name;
        this.theFourthOfJuly = theFourthOfJuly;
        this.breed = breed;
        this.color = color;
        this.favoriteFood = favoriteFood;
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTheFourthOfJuly() {
        return theFourthOfJuly;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

}
