package cine.controller;
import cine.entidad.Salas;
import cine.service.JPA.SalasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("cine/entidad/Salas")
public class SalasController {
    private final SalasService salasService;

    public SalasController(SalasService salasService) {
        this.salasService = salasService;
    }

    @GetMapping
    public List<Salas> getAll(){
        return salasService.getAll();
    }

    @GetMapping("/{id}")
    public Salas getOne(@PathVariable Long id) {
        return salasService.getOne(id);
    }

    @PostMapping
    public Salas insert(@RequestBody Salas obj) {
        return salasService.insert(obj);
    }

    @PutMapping("/{id}")
    public Salas update(@PathVariable Long id, @RequestBody Salas obj) {
        return salasService.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        salasService.delete(id);
    }
}
