package cine.service;

import cine.entidad.Proyecciones;
import cine.repositorios.repositorioMongo.ProyeccionesRepositorioMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyeccionesService {
    @Autowired
    private ProyeccionesRepositorioMongo proyRepositorio;
    public Proyecciones getOne(Long id) {
        return proyRepositorio.findById(id).orElse(null);
    }
    public List<Proyecciones> getAll() {
        return proyRepositorio.findAll();
    }

    public Proyecciones update(Long id, Proyecciones obj) {
        return proyRepositorio.save(obj);
    }

    public void delete(Long id) {
        proyRepositorio.deleteById(id);
    }

    public Proyecciones insert(Proyecciones obj) {
        return proyRepositorio.save(obj);
    }
}
