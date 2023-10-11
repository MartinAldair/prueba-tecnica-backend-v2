package com.martinaldair.backend.examenv2.repository.impl;

import com.martinaldair.backend.examenv2.model.Persona;
import com.martinaldair.backend.examenv2.repository.PersonaDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Martin Aldair
 */
@Repository("personaDaoImpl")
public class PersonaDaoImpl implements PersonaDao {
    /**
     * Genera una lista de personas.
     *
     * @return
     */
    public static List<Persona> generarListaDePersonas() {
        final Persona persona1 = new Persona(1, "UsuarioA", "ApellidoA", "RFCEjemploA", "CURPEjemploA", 18, "Femenino", "Mexicana");
        final Persona persona2 = new Persona(2, "UsuarioB", "ApellidoB", "RFCEjemploB", "CURPEjemploB", 19, "Masculino", "Mexicana");
        final Persona persona3 = new Persona(3, "UsuarioC", "ApellidoC", "RFCEjemploC", "CURPEjemploC", 20, "Masculino", "Mexicana");
        final Persona persona4 = new Persona(4, "UsuarioD", "ApellidoD", "RFCEjemploD", "CURPEjemploD", 21, "Masculino", "Mexicana");
        final List< Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        return personas;
    }

    @Override
    public List<Persona> encontrarTodasLasPersonas() {
        return generarListaDePersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Integer id) {
        Persona persona = generarListaDePersonas().stream().filter(elemento -> elemento.getId().equals(id)).findAny().orElse(null);
        return persona;
    }

}
