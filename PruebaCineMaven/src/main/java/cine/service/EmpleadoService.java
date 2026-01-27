package cine.service;
import cine.entidad.Empleado;
import cine.repositorio.EmpleadoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    //bean: empleadoRepositorio
    //silguenton: es un objeto instanciado, y solo se instancia una vez. Rompe toda la estructura de objetos
    //opcional: es un objeto que instacia java automaticamente, para que no devuelva un null.
    @Autowired
    /*@Autowired es una anotación de Spring que sirve para inyectar dependencias automáticamente.
    Es decir: Spring crea los objetos por ti y te los entrega listos para usar,
    sin que tengas que hacer new.*/
    private EmpleadoRepositorio empleadoRepositorio;
    public Empleado getOne(Long id) {
        //Save se encarga de registra los datos.
        return empleadoRepositorio.findById(id).orElse(null);
    }
    public List<Empleado> getAll() {
        return empleadoRepositorio.findAll();
    }

    public Empleado update(Long id, Empleado obj) {
        return empleadoRepositorio.save(obj);
    }

    public void delete(Long id) {
        empleadoRepositorio.deleteById(id);
    }

    public Empleado insert(Empleado obj) {
        return empleadoRepositorio.save(obj);
    }
}
