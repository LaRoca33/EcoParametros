package org.aaroca.ecoparametros.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor @RequiredArgsConstructor
@Getter
public class Pais {
    private String pais;
    private String idioma;
    private String prefijotelefonicoPais;
    private Boolean muestraIdioma;

}
