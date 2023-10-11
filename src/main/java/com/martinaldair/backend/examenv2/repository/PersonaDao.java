package com.martinaldair.backend.examenv2.repository;

import com.martinaldair.backend.examenv2.model.Persona;
import java.util.List;

/**
 *
 * @author Martin Aldair
 */
public interface PersonaDao {
    
    public List<Persona> encontrarTodasLasPersonas();

    public Persona encontrarPersonaPorId(Integer id);

}
