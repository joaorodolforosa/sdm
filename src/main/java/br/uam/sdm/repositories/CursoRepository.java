package br.uam.sdm.repositories;

import br.uam.sdm.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Joao Rodolfo
 */
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
