package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2018,07,04);

    @Test
    public void a_new_dog_should_have_a_name() throws Exception {

        Dog juan = Dog.called("Fido")
                      .OfBreed("Poodle")
                      .OfColor("Negro")
                      .BornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", juan.getName());
        Assert.assertEquals(THE_FOURTH_OF_JULY, juan.getTheFourthOfJuly());
        Assert.assertEquals("Poodle", juan.getBreed());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food()throws Exception {
    }
}
