/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author fp01ajweb8
 */
@Entity
@Table
public class Aluno extends Pessoa implements Serializable{
    
    private String registroAluno;
    

    public String getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(String registroAluno) {
        this.registroAluno = registroAluno;
    }

    public Aluno() {
    }

    public Aluno(String registroAluno, int id, String nome, String email, String dataNascimento, Documento documento, Endereco endereco) {
        super(id, nome, email, dataNascimento, documento, endereco);
        this.registroAluno = registroAluno;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.registroAluno);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.registroAluno, other.registroAluno)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "registroAluno=" + registroAluno + '}'  + super.getDocumento() +  super.getEndereco();
    }



    
    
}
