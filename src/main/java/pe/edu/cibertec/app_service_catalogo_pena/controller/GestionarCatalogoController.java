package pe.edu.cibertec.app_service_catalogo_pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GestionarCatalogoController {

    @GetMapping("/pelicula")
    public String obtenerPelicula() {
        return "Resultado de búsqueda de películas";
    }

    @GetMapping("/filtrar")
    public String filtrarPelicula(){
        return "Resultado de películas filtradas";
    }

}
