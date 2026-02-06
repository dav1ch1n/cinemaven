package cine.service.JPA;

import cine.entidad.Entradas;
import cine.repositorios.repositorioJPA.EntradasRepositorioJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// lo que hago es separar los service que usan JPA de los que usan MongoDB, para tener un mejor orden.
// como solo empleados es lo que se pone en mongoDB, es la única que estará en esa carpeta
// el resto estrán en esta carpeta de JPA.
@Service
public class EntradasService {
@Autowired
    private EntradasRepositorioJPA entRepositorio;
    public Entradas getOne(Long id) {
        return entRepositorio.findById(id).orElse(null);
    }
    public List<Entradas> getAll() {
        return entRepositorio.findAll();
    }

    public Entradas update(Long id, Entradas obj) {
        return entRepositorio.save(obj);
    }

    public void delete(Long id) {
        entRepositorio.deleteById(id);
    }

    public Entradas insert(Entradas obj) {
        return entRepositorio.save(obj);
    }
}
