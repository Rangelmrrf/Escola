/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author fp01ajweb8
 */
public class Turma {
    
    private String nome;
    private Turno turno;
    private List<Aluno> alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Turma() {
    }

    public Turma(String nome, Turno turno, List<Aluno> alunos) {
        this.nome = nome;
        this.turno = turno;
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.turno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.turno != other.turno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + ", turno=" + turno + ", alunos=" + alunos + '}';
    }
    
    
    
    
}
