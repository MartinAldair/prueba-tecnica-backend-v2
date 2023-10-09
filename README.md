# prueba-tecnica-backend-v2

Ejercicio 1
Supone que debes establecer una contraseña para una cuenta bancaria. Sin embargo, hay tres restricciones en el formato de la contraseña:

a) Debe contener solo caracteres alfanuméricos (a−z, A−Z, 0−9);
b) Debe haber un número par de letras;
c) Debe haber un número impar de dígitos.

Como input debe recibir una cadena S de N caracteres.  La cadena S se puede dividir en palabras dividiéndola y eliminando los espacios. El objetivo es elegir la palabra más larga que sea una contraseña válida. Puede suponer que, si hay K espacios en la cadena S, entonces hay exactamente K + 1 palabras.

Por ejemplo, dado "test 5 a0A pass007 ?xy1", hay cinco palabras y tres de ellas son contraseñas válidas: "5", "a0A" y "pass007". Por lo tanto, la contraseña más larga es "pass007" y su longitud es 7.

Genera una clase que, dada una cadena S no vacía que consta de N caracteres, devuelve la longitud de la palabra más larga de la cadena que es una contraseña válida. Si no existe tal palabra, su función debería devolver −1, como se explicó anteriormente.

Asumir que:

N es un número entero dentro del rango [1..200];
La cadena S consta únicamente de caracteres y espacios ASCII imprimibles.

# Manejo de Errores

Ejercicio 2
Dado la siguiente clase agrega el manejo de errores correspondientes y justifica él porque

 public class Examen {
	    public static void main (String [] args)     {	
	            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
	            System.out.println("Instrucción 1.");
	            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
	            System.out.println("Instrucción 2.");
	            System.out.println("Instrucción 3, etc.");
	    }
}

Ejercicio 3
Dado el siguiente método, agregar el código necesario para que el método genere una excepción personalizada en caso de error.

public static Date getFecha(String fecha, String formato) {
	SimpleDateFormat formatter = new SimpleDateFormat(formato);
      String dateInString = fecha;
      Date fechaSalida = null;
    	try {
		fechaSalida = formatter.parse(dateInString);
	} catch (ParseException e) {
		LOGGER.error("Error" + e);
	}
		
    	return fechaSalida;
}

Ejercicio 4
Genera un microservicio utilizando el framework de spring boot y compartir el código, considere los siguientes puntos:

- El servicio debe tener 3 capas: Controller, Service, DAO (@Controller, @Service, @Repository)
- Genera un Modelo que contenga las propiedades para identificar a una persona, ejemplo: id, nombre, apellidos, rfc, curp, edad, sexo, nacionalidad.
- Generar un endpoint REST que reciba como parámetro el id, el parámetro es opcional.
- Generar la lógica correspondiente para que al invocar el endpoint se recupere un listado de personas en caso de que el id no venga informado.
- En caso de informar el id solo debe retornar la persona con el id correspondiente.
- La recuperación de la información debe de utilizar las 3 capas (Controller, Service, DAO), siendo la capa DAO donde se simule la recuperación de la información.
- La inyección de dependencias de ser por medio de interfaces
- Documentar el código
- Separar las clases en package nombrados de acuerdo a su funcionalidad, por ejemplo:
- mx.examen.service -> contiene solo clases Service
- mx.examen.model -> contiene solo clases entidades TO
