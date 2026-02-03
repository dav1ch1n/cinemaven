package cine.service;

import cine.entidad.Entradas;
import cine.repositorios.repositorioMongo.EntradasRepositorioMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradasService {
@Autowired
    private EntradasRepositorioMongo entRepositorio;
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
