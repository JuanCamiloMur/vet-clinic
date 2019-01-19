package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Human {
    private final String nombre;
    private final String profesion;
    private final LocalDateTime nacimiento;
    private final String comidaFavorita;

    public Human(String nombre, String profesion, LocalDateTime nacimiento) {
        this(nombre, profesion, nacimiento, null);
    }

    public Human(String nombre, String profesion, LocalDateTime nacimiento, String comidaFavorita) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.nacimiento = nacimiento;
        this.comidaFavorita = comidaFavorita;
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

    public static HumanConstructor llamado(String nombre) {
        return new HumanConstructor(nombre);
    }

    public static class HumanConstructor{
        private String nombre;
        private String profesion;
        private LocalDateTime nacimiento;

        public HumanConstructor(String nombre){

            this.nombre = nombre;
        }

        public HumanConstructor deProfesion(String profesion) {
            this.profesion = profesion;
            return this;
        }

        public Human nacidoEn(LocalDateTime nacimiento) {
            return new Human(nombre,profesion,nacimiento);
        }


    }

}

