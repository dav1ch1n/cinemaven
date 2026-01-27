package cine.controller;

import cine.entidad.Entradas;
import cine.service.EntradasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("cines/entidad/Entradas")
public class EntradasController {
    private final EntradasService entService;
    public EntradasController(EntradasService entService) {
        this.entService = entService;
    }
    @GetMapping
    public List<Entradas> getAll(){
        return entService.getAll();
    }
    @GetMapping("/{id}")
    public Entradas getById(@PathVariable Long id) {
        return entService.getOne(id);
    }
    @PostMapping
    public Entradas create(@RequestBody Entradas ent) {
        return entService.insert(ent);
    }
    @PutMapping("/{id}")
    public Entradas update(@PathVariable Long id, @RequestBody Entradas ent) {
        return entService.update(id, ent);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        entService.delete(id);
    }
}
