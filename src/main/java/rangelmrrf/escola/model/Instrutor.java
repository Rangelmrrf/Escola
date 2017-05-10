/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author fp01ajweb8
 */

@Entity
@Table
public class Instrutor extends Pessoa implements Serializable{

    public Instrutor() {
    }

    public Instrutor(int id, String nome, String email, String dataNascimento, Documento documento, Endereco endereco) {
        super(id, nome, email, dataNascimento, documento, endereco);
    }

    @Override
    public String toString() {
        return "Instrutor{" + super.toString()+ '}';
    }
    
    
    
}
