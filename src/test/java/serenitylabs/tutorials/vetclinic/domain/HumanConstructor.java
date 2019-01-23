package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public  class HumanConstructor implements ConProfesion, ConEtnia{
        private String nombre;
        private String profesion;
        private String comidaFavorita;
        private String etnia;

        public static HumanConstructor unHumano(){
            return new HumanConstructor();
        }

        public static HumanConstructor unAlienigena() {
                return unHumano().deProfesion("Ingeniero en sistemas");
        }

    public HumanConstructor llamado(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public HumanConstructor deEtnia(String etnia) {
        this.etnia = etnia;
        return this;
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

    }