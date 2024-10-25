
package br.uam.sdm.services;

import br.uam.sdm.entities.Curso;
import br.uam.sdm.repositories.CursoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joao Rodolfo
 */
@Service
public class CursoService {
    
    @Autowired
    private CursoRepository repository;
    
    public List<Curso> findAll() {
        return repository.findAll();
    }
    
    public Curso findById(Long id) {
        Optional<Curso> obj =  repository.findById(id);
        return obj.get();
    }
    
    public Curso insert(Curso obj) {
        return repository.save(obj);
    }
    
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public Curso update(Long id, Curso obj) {
        Curso entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Curso entity, Curso obj) {
        entity.setCod_curso(obj.getCod_curso());
        entity.setNome_curso(obj.getNome_curso());
    }
    
}
