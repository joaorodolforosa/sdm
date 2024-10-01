package br.uam.sdm.controller;

import br.uam.sdm.entities.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joao Rodolfo
 */

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {
    
    @GetMapping
	public ResponseEntity<Curso> findAll() {
		Curso c = new Curso(1L, "es", "Engenharia de Software");
		return ResponseEntity.ok().body(c);
	}
    
}
