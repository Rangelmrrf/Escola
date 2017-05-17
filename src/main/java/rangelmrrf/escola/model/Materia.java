/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author fp01ajweb8
 */
@Entity
@Table
public class Materia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private Integer id;
    private String nome;
    private String cargaHoraria;
    @OneToMany(mappedBy = "materia")
    private List<Aula> aulas;
    @Transient
    private Curso curso;
    
    @ElementCollection
    @CollectionTable(
          name="MATERIA_INSTRUTOR",
          joinColumns=@JoinColumn(name="MATERIA_ID")
  )
    private List<MateriaInstrutor> materiaInstrutores;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cargaHoraria);
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
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargaHoraria, other.cargaHoraria)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

      public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<MateriaInstrutor> getMateriaInstrutores() {
        return materiaInstrutores;
    }

    public void setMateriaInstrutores(List<MateriaInstrutor> materiaInstrutores) {
        this.materiaInstrutores = materiaInstrutores;
    }

    public Materia() {
    }

    public Materia(String nome, String cargaHoraria, List<Aula> aulas) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", aulas=" + aulas + ", materia instrutores="+ materiaInstrutores+'}';
    }

    public void getCargaHoraria(String _horas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
