package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements WithBreed, WithColor{

        private String name;
        private String breed;
        private LocalDate theFourthOfJuly;
        private String color;
        private String favoriteFood;
        private String favoriteToy;

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public static  DogBreeder aCat(){
        return aDog().OfBreed("Ragdoll");
    }

    public static DogBreeder aFish() {
        return aDog().OfBreed("Vagre");
    }

    public  DogBreeder called(String name) {
        this.name=name;
        return this;
    }

    public DogBreeder OfBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBreeder OfColor(String color) {
            this.color = color;
            return this;
        }

        public Dog BornOn(LocalDate theFourthOfJuly) {
            return new Dog(name,theFourthOfJuly,breed,color,favoriteFood,favoriteToy);
        }


        public DogBreeder OfFavoriteFood(String favoriteFood) {
            this.favoriteFood = favoriteFood;
            return this;
        }

        public DogBreeder OfFavoriteToy(String favoriteToy) {
            this.favoriteToy = favoriteToy;
            return this;
        }

    }