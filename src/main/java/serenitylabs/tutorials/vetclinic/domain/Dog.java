package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDate theFourthOfJuly;
    private final String breed;

    public Dog(String name, LocalDate theFourthOfJuly, String breed) {
        this.name = name;
        this.theFourthOfJuly = theFourthOfJuly;
        this.breed = breed;
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

    public static DogBreeder called(String name) {
        return new DogBreeder(name);
    }

    public static class DogBreeder{

        private String name;
        private String breed;
        private LocalDate theFourthOfJuly;

        public DogBreeder(String name){
            this.name = name;
        }

        public DogBreeder OfBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog BornOn(LocalDate theFourthOfJuly) {
            return new Dog(name,theFourthOfJuly,breed);
        }
    }
}
