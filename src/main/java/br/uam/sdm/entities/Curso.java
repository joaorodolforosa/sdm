package br.uam.sdm.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joao Rodolfo
 */
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Long id;
    private String cod_curso;
    private String nome_curso;
    
    public Curso() {
        
    }

    public Curso(Long id, String cod_curso, String nome_curso) {
        this.id = id;
        this.cod_curso = cod_curso;
        this.nome_curso = nome_curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(String cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
