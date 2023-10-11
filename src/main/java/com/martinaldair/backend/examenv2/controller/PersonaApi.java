/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.47).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.martinaldair.backend.examenv2.controller;

import io.swagger.model.Persona;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-11T18:42:24.459850685Z[GMT]")
@Validated
public interface PersonaApi {

    @Operation(summary = "Encuentra una persona por ID", description = "El Id de persona retorna", tags={ "persona" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Persona.class))),
        
        @ApiResponse(responseCode = "400", description = "Id Invalido"),
        
        @ApiResponse(responseCode = "404", description = "Persona no encontrada") })
    @RequestMapping(value = "/persona/{personaId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Persona> obtienePersonaPorId(@Parameter(in = ParameterIn.PATH, description = "El Id de persona retorna", required=true, schema=@Schema()) @PathVariable("personaId") Integer personaId);


    @Operation(summary = "Encuentra todas las personas", description = "Se obtiene todas las personas mediante una lista", tags={ "persona" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Persona.class)))),
        
        @ApiResponse(responseCode = "404", description = "Personas no encontradas") })
    @RequestMapping(value = "/persona",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Persona>> obtieneTodasLasPersonas();

}

