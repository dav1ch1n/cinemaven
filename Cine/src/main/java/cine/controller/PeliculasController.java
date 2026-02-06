package cine.controller;

import cine.service.JPA.PeliculasService;
import cine.entidad.Peliculas;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("cine/entidad/Peliculas")
public class PeliculasController {
    private final PeliculasService peliService;
    public PeliculasController(PeliculasService peliService) {
        this.peliService = peliService;
    }
    @GetMapping
    public List<Peliculas> getAll() {
        return peliService.getAll();
    }
    @GetMapping("/{id}")
    public Peliculas getById(@PathVariable Long id) {
        return peliService.getOne(id);
    }
    @PostMapping
    public Peliculas create(@RequestBody Peliculas pel) {
        return peliService.insert(pel);
    }
    @PutMapping("/{id}")
    public Peliculas update(@PathVariable Long id, @RequestBody Peliculas pel) {
        return peliService.update(id, pel);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        peliService.delete(id);
    }
}
