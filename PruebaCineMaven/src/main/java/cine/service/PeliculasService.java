package cine.service;

import cine.entidad.Peliculas;
import cine.repositorio.PeliculasRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasService {
    @Autowired
    private PeliculasRepositorio peliRepository;
    public Peliculas getOne(Long id) {
        return peliRepository.findById(id).orElse(null);
    }
    public List<Peliculas> getAll() {
        return peliRepository.findAll();
    }

    public Peliculas update(Long id, Peliculas obj) {
        return peliRepository.save(obj);
    }

    public void delete(Long id) {
        peliRepository.deleteById(id);
    }

    public Peliculas insert(Peliculas obj) {
        return peliRepository.save(obj);
    }
}
