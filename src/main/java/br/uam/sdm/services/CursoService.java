
package br.uam.sdm.services;

import br.uam.sdm.entities.Curso;
import br.uam.sdm.repositories.CursoRepository;
import java.util.List;
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
    
    
}
