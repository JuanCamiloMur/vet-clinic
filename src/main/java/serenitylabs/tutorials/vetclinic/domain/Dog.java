package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDate theFourthOfJuly;
    private final String breed;
    private final String color;

    public Dog(String name, LocalDate theFourthOfJuly, String breed, String color) {
        this.name = name;
        this.theFourthOfJuly = theFourthOfJuly;
        this.breed = breed;
        this.color = color;
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

    public static DogBreeder called(String name) {
        return new DogBreeder(name);
    }

    interface WithBreed{
        WithColor OfBreed(String breed);
    }

    interface WithColor{
        DogBreeder OfColor(String color);
    }

    public static class DogBreeder implements WithBreed, WithColor{

        private String name;
        private String breed;
        private LocalDate theFourthOfJuly;
        private String color;

        public DogBreeder(String name){
            this.name = name;
        }

        public WithColor OfBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBreeder OfColor(String color) {
            this.color = color;
            return this;
        }

        public Dog BornOn(LocalDate theFourthOfJuly) {
            return new Dog(name,theFourthOfJuly,breed,color);
        }


    }
}
