package com.martinaldair.backend.examenv2.service;

import com.martinaldair.backend.examenv2.model.Persona;
import java.util.List;

/**
 *
 * @author Martin Aldair
 */
public interface PersonaService {

    Persona encontrarPersonaPorId(Integer id);

    List<Persona> encontrarTodasLasPersonas();

}
