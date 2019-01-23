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

    public String getEtnia() {
        return etnia;
    }


}

