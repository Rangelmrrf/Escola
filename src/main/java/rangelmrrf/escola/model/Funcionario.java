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
public class Funcionario extends Pessoa implements Serializable{
    
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario() {
       
    }

    public Funcionario(String cargo, int id, String nome, String email, String dataNascimento, Documento documento, Endereco endereco) {
        super(id, nome, email, dataNascimento, documento, endereco);
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.cargo);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + super.getDocumento() + super.getEndereco()+'}';
    }
    
    
    
    
}
