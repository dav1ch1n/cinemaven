package cine.service.MongoDB;
import cine.entidad.Empleado;
import cine.repositorios.repositorioMongo.EmpleadoRepositorioMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
   // El service de mongo es igual que el de JPA, lo unico que cambia es el repositorio que se inyecta, y el tipo de dato del id,
   // que en mongo es String y en JPA es Long.
    @Autowired
    private EmpleadoRepositorioMongo empleadoRepositorioMongo;
    public Empleado getOne(String id) {
        //Save se encarga de registra los datos.
        return empleadoRepositorioMongo.findById(id).orElse(null);
    }
    public List<Empleado> getAll() {
        return empleadoRepositorioMongo.findAll();
    }

    public Empleado update(String id, Empleado obj) {
        return empleadoRepositorioMongo.save(obj);
    }

    public void delete(String id) {
        empleadoRepositorioMongo.deleteById(id);
    }

    public Empleado insert(Empleado obj) {
        return empleadoRepositorioMongo.save(obj);
    }
}
