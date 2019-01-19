package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewHuman {

    @Test
    public void deberia_tener_un_nombre() throws Exception {
        LocalDateTime nacimiento = LocalDateTime.now();

        Human juan = Human.llamado("Juan")
                          .deProfesion("Ingeniero en sistemas")
                          .nacidoEn(nacimiento);

        Assert.assertEquals("Juan",juan.getNombre());
        Assert.assertEquals("Ingeniero en sistemas", juan.getProfesion());
        Assert.assertEquals(nacimiento, juan.getNacimiento());
        
    }

    @Test
    public void deberia_tener_una_comida_favorita_opcional() throws Exception {
        LocalDateTime nacimiento = LocalDateTime.now();

        Human juan = new Human("Juan","Ingeniero en sistemas", nacimiento, "Pizza");

        Assert.assertEquals("Pizza", juan.getComidaFavorita());
    }
}
