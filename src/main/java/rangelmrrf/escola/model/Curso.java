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
public class Curso {
    
    private String nome;
    private String CargaHoraria;
    private Double preco;
    private String descricao;
    private String requisito;
    private List<Turma> turmas;
    private List<Materia> materias;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(String CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Curso() {
    }

    public Curso(String nome, String CargaHoraria, Double preco, String descricao, String requisito) {
        this.nome = nome;
        this.CargaHoraria = CargaHoraria;
        this.preco = preco;
        this.descricao = descricao;
        this.requisito = requisito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.descricao);
        hash = 13 * hash + Objects.hashCode(this.requisito);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.requisito, other.requisito)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", CargaHoraria=" + CargaHoraria + ", preco=" + preco + ", descricao=" + descricao + ", requisito=" + requisito + '}';
    }
    
    
    
}
