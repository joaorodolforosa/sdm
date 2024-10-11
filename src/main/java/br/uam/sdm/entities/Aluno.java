package br.uam.sdm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

/**
 *
 * @author Joao Rodolfo
 */

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private long ra;
    private String nome_aluno;
    private String cpf;
    private Instant data_de_matricula;
    
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    
    public Aluno() {
        
    }

    public Aluno(long ra, String nome_aluno, String cpf, Instant data_de_matricula, Curso curso) {
        this.ra = ra;
        this.nome_aluno = nome_aluno;
        this.cpf = cpf;
        this.data_de_matricula = data_de_matricula;
        this.curso = curso;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Instant getData_de_matricula() {
        return data_de_matricula;
    }

    public void setData_de_matricula(Instant data_de_matricula) {
        this.data_de_matricula = data_de_matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Aluno other = (Aluno) obj;
        return this.ra == other.ra;
    }
    
}
