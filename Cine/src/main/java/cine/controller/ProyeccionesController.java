package cine.controller;
import cine.entidad.Proyecciones;
import cine.service.JPA.ProyeccionesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("cine/entidad/Proyecciones")
public class ProyeccionesController {
    private final ProyeccionesService proyectService;

    public ProyeccionesController(ProyeccionesService proyectService) {
        this.proyectService = proyectService;
    }
    @GetMapping
    public List<Proyecciones> getAll(){
        return proyectService.getAll();
    }

    @GetMapping("/{id}")
    public Proyecciones getOne(@PathVariable Long id) {
        return proyectService.getOne(id);
    }

    @PostMapping
    public Proyecciones insert(@RequestBody Proyecciones obj) {
        return proyectService.insert(obj);
    }

    @PutMapping("/{id}")
    public Proyecciones update(@PathVariable Long id, @RequestBody Proyecciones obj) {
        return proyectService.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        proyectService.delete(id);
    }
}
