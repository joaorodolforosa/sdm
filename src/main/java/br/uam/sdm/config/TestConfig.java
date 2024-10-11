package br.uam.sdm.config;

import br.uam.sdm.entities.Aluno;
import br.uam.sdm.entities.Curso;
import br.uam.sdm.repositories.AlunoRepository;
import br.uam.sdm.repositories.CursoRepository;
import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author Joao Rodolfo
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;
    
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Curso sdm = new Curso(null, "sdm", "Sistemas Distribuidos e Mobile");
        Curso es = new Curso(null, "es", "Engenharia de Software");
        
        Aluno jose = new Aluno(123456, "Jose da Silva", "123456789-10", Instant.parse("2024-02-23T08:00:00Z"), sdm); 
        Aluno pedro = new Aluno(123654, "Pedro", "123456789-10", Instant.parse("2024-02-23T08:00:00Z"), sdm); 
        Aluno ana = new Aluno(123987, "Ana Maria", "123456789-10", Instant.parse("2024-02-23T08:00:00Z"),es); 
        Aluno joao = new Aluno(123123, "Joao Francisco", "123456789-10", Instant.parse("2024-02-23T08:00:00Z"), sdm);
        
        cursoRepository.saveAll(Arrays.asList(sdm, es));
        alunoRepository.saveAll(Arrays.asList(jose, pedro, ana, joao));
    }

}
