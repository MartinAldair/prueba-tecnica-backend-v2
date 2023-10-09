package com.martinaldair.backend.examenv2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.martinaldair.backend.examenv2.util.MiExcepcionPersonalizada;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class Examenv2ApplicationTests {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    /**
     * Ejercicio 2
     * 
     * Dado la siguiente clase agrega el manejo de errores correspondientes y justifica él porque
     */
    @Test
    void test_Ejercicio_2() {
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");
        System.out.println("Instrucción 1.");
        /* 
        En el presente ejercicio se utiliza el bloque try-catch, porque sirve para
        saber el tipo de excepción que esta en el metodo parseInt() de la clase Integer.
        Al momento ejecutarse el metodo parseInt() y al no encontrar caracteres de
        tipo numerico y solamente letras, se produce una excepción de tipo 
        java.lang.NunmberFormatException
         */
        try {
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
        } catch (Exception ex) {
            log.error("Tipo de error: " + ex);
        }
        System.out.println("Instrucción 2.");
        System.out.println("Instrucción 3, etc.");
    }
    
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
