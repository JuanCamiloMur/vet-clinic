package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Human {
    private final String nombre;
    private final String profesion;
    private final LocalDateTime nacimiento;
    private final String comidaFavorita;
    private final String etnia;


    public Human(String nombre, String profesion, LocalDateTime nacimiento, String comidaFavorita, String etnia) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.nacimiento = nacimiento;
        this.comidaFavorita = comidaFavorita;
        this.etnia = etnia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public static ConProfesion llamado(String nombre) {
        return new HumanConstructor(nombre);
    }

    public String getEtnia() {
        return etnia;
    }

    interface ConProfesion{
            ConEtnia deProfesion(String profesion);
    }

    interface ConEtnia{
        HumanConstructor deEtnia(String etnia);
    }

    public static class HumanConstructor implements ConProfesion, ConEtnia{
        private String nombre;
        private String profesion;
        private String comidaFavorita;
        private String etnia;


        public HumanConstructor(String nombre){

            this.nombre = nombre;
        }

        public HumanConstructor deProfesion(String profesion) {
            this.profesion = profesion;
            return this;
        }

        public Human nacidoEn(LocalDateTime nacimiento) {
            return new Human(nombre,profesion,nacimiento, comidaFavorita,etnia);
        }


        public HumanConstructor suComidaFavorita(String comidaFavorita) {
            this.comidaFavorita = comidaFavorita;
            return this;
        }

        public HumanConstructor deEtnia(String etnia) {
            this.etnia = etnia;
            return this;
        }
    }

}

