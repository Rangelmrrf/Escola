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
public class Materia {
    
    private String nome;
    private String conteudo;
    private String cargaHoraria;
    private Instrutor instrutor;
    private List<Questao> questoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public Materia() {
    }

    public Materia(String nome, String conteudo, String cargaHoraria, Instrutor instrutor, List<Questao> questoes) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
        this.questoes = questoes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.conteudo);
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
        if (!Objects.equals(this.conteudo, other.conteudo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Materia{" + "nome=" + nome + ", conteudo=" + conteudo + ", cargaHoraria=" + cargaHoraria + ", instrutor=" + instrutor + ", questoes=" + questoes + '}';
    }
    
    
    
}
