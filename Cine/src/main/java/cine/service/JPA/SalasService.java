package cine.service.JPA;

import cine.entidad.Salas;
import cine.repositorios.repositorioJPA.SalasRepositorioJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalasService {
    @Autowired
    private SalasRepositorioJPA salRepository;
    public Salas getOne(Long id) {
        return salRepository.findById(id).orElse(null);
    }
    public List<Salas> getAll() {
        return salRepository.findAll();
    }

    public Salas update(Long id, Salas obj) {
        return salRepository.save(obj);
    }

    public void delete(Long id) {
        salRepository.deleteById(id);
    }

    public Salas insert(Salas obj) {
        return salRepository.save(obj);
    }
}
