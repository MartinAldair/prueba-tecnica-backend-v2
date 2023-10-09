package com.martinaldair.backend.examenv2.service.impl;

import com.martinaldair.backend.examenv2.model.Persona;
import com.martinaldair.backend.examenv2.repository.impl.PersonaDaoImpl;
import com.martinaldair.backend.examenv2.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Martin Aldair
 */
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDaoImpl personaDaoImpl;

    /**
     * Método para buscar una persona por id que se encuentran en la capa DAO 
     * donde se simula la recuperación de la información
     * 
     * @param id
     * @return
     */
    @Override
    public Persona encontrarPersonaPorId(Integer id) {
        return this.personaDaoImpl.encontrarPersonaPorId(id);
    }

    /**
     * Método para obtener una lista de todas las personas que se encuentran en 
     * la capa DAO donde se simula la recuperación de la información
     * 
     * @return List
     */
    @Override
    public List<Persona> encontrarTodasLasPersonas() {
        List<Persona> listaDeUsuarios = (List<Persona>) this.personaDaoImpl.encontrarTodasLasPersonas();
        return listaDeUsuarios;
    }

}
