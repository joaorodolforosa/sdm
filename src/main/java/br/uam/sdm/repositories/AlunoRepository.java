package br.uam.sdm.repositories;

import br.uam.sdm.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Joao Rodolfo
 */

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
