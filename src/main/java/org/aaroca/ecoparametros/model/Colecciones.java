package org.aaroca.ecoparametros.model;


import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

    public class Colecciones {
        @Getter
        private static final Map<String, String> listaGeneros = new HashMap<>();
        @Getter
        private static final Map<String, Pais> listaPaises = new HashMap<>();
        @Getter
        private static final Map<String, String> listaMusicas = new HashMap<>();
        @Getter
        private static final Map<String, String> listaAficiones = new HashMap<>();
        static {
            listaGeneros.put("F", "Femenino");
            listaGeneros.put("M", "Masculino");
            listaGeneros.put("O", "Otro");

            listaPaises.put("es", new Pais("España", "Castellano", "34", true));
            listaPaises.put("fr", new Pais("Francia", "Francés", "33", false));
            listaPaises.put("it", new Pais("Italia", "Italiano", "39", false));
            listaPaises.put("pt", new Pais("Portugal", "Portugués", "351", false));
            listaPaises.put("en", new Pais("Reino unido", "Inglés", "44", true));

            listaMusicas.put("E", "Electrónica");
            listaMusicas.put("F", "Funky");
            listaMusicas.put("N", "New Age");
            listaMusicas.put("P", "Pop");
            listaMusicas.put("R", "Rock");

            listaAficiones.put("D", "Deporte");
            listaAficiones.put("L", "Lectura");
            listaAficiones.put("P", "Pintura");
            listaAficiones.put("V", "Viajes");
        }
    }


