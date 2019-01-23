package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewHuman {

    @Test
    public void deberia_tener_un_nombre() throws Exception {
        LocalDateTime nacimiento = LocalDateTime.now();

        Human juan = HumanConstructor.unAlienigena()
                .llamado("Juan")
                .deEtnia("Afroamericano")
                .suComidaFavorita("Pizza")
                .nacidoEn(nacimiento);

        Assert.assertEquals("Juan", juan.getNombre());
        Assert.assertEquals("Ingeniero en sistemas", juan.getProfesion());
        Assert.assertEquals(nacimiento, juan.getNacimiento());
        Assert.assertEquals("Pizza", juan.getComidaFavorita());
        Assert.assertEquals("Afroamericano", juan.getEtnia());

    }

}
