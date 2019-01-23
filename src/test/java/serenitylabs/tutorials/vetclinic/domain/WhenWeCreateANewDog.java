package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2018,07,04);

    @Test
    public void a_new_dog_should_have_a_name() throws Exception {

        Dog juan = DogBreeder.aFish()
                      .called("Carlos")
                      .OfColor("Negro")
                      .BornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Carlos", juan.getName());
        Assert.assertEquals("Vagre", juan.getBreed());
        Assert.assertEquals("Negro", juan.getColor());
        Assert.assertEquals(THE_FOURTH_OF_JULY, juan.getTheFourthOfJuly());

    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food()throws Exception {

        Dog juan = DogBreeder.aDog()
                .called("Fido")
                .OfBreed("Poodle")
                .OfColor("Negro")
                .OfFavoriteFood("Pizza")
                .BornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", juan.getName());
        Assert.assertEquals("Poodle", juan.getBreed());
        Assert.assertEquals("Pizza", juan.getFavoriteFood());
        Assert.assertEquals(THE_FOURTH_OF_JULY, juan.getTheFourthOfJuly());

    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() throws Exception {

        Dog juan = DogBreeder.aCat()
                .called("Misifu")
                .OfColor("Negro")
                .OfFavoriteToy("cat")
                .BornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Misifu", juan.getName());
        Assert.assertEquals("Ragdoll", juan.getBreed());
        Assert.assertEquals("cat", juan.getFavoriteToy());
        Assert.assertEquals(THE_FOURTH_OF_JULY, juan.getTheFourthOfJuly());

    }
}
