package com.martinaldair.backend.examenv2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.martinaldair.backend.examenv2.util.MiExcepcionPersonalizada;

@SpringBootTest
class Examenv2ApplicationTests {
    
    /**
     * Ejercicio 3
     * 
     * Dado el siguiente método, agregar el código necesario para que el método 
     * genere una excepción personalizada en caso de error.
     * @param fecha
     * @param formato
     * @return Date
     */
    public static Date getFecha(String fecha, String formato) {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        String dateInString = fecha;
        Date fechaSalida = null;
        try {
            fechaSalida = formatter.parse(dateInString);
        } catch (ParseException e) {
            /* En la clase MiExcepcionPersonalizada se explica a detalle la
            implementacion personalizada de una excepcion*/
            throw new MiExcepcionPersonalizada("A message that describes the error.");
        }

        return fechaSalida;
    }
    
    @Test
    void test_Ejercicio_3() {
        String fechaFormatoCorrecto = "01/07/2023 12:04:59";
        String fechaFormatoIncorrecto = "a";
        String nuevoFormatoDeFecha = "MM/dd/yyyy";
        getFecha(fechaFormatoIncorrecto, nuevoFormatoDeFecha);
    }
    
}
