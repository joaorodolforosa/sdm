package br.uam.sdm.config;

import br.uam.sdm.entities.Curso;
import br.uam.sdm.repositories.CursoRepository;
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

    @Override
    public void run(String... args) throws Exception {
        
        Curso sdm = new Curso(null, "sdm", "Sistemas Distribuidos e Mobile");
        Curso es = new Curso(null, "es", "Engenharia de Software");
        
        cursoRepository.saveAll(Arrays.asList(sdm, es));
    }

}
