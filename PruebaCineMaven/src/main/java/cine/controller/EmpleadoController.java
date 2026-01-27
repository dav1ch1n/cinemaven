package cine.controller;

import cine.entidad.Empleado;
import cine.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*REST define funciones claras para cada método HTTP dentro de esta colección.
GET: Obtener todos los elementos	GET /usuarios
POST: Crear un nuevo elemento	POST /usuarios
PUT: Reemplazar toda la colección	PUT /usuarios
PATCH: Actualizar parcialmente toda la colección	PATCH /usuarios
DELETE: Borrar toda la colección	DELETE /usuarios*/

@RestController
@RequestMapping("cines/entidad/Empleado")
public class EmpleadoController {
    private final EmpleadoService EmpService;
    public EmpleadoController(EmpleadoService empService) {
        EmpService = empService;
    }
    @GetMapping
    public List<Empleado> getAll(){
        return EmpService.getAll();
    }
    @GetMapping("/{id}")
    public Empleado getById(@PathVariable Long id) {
        return EmpService.getOne(id);
    }
    @PostMapping
    public Empleado create(@RequestBody Empleado emp) {
        return EmpService.insert(emp);
    }
    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado emp) {
        return EmpService.update(id, emp);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        EmpService.delete(id);
    }
}
