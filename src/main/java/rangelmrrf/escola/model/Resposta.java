/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author fp01ajweb8
 */
@Entity
@Table
public class Resposta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String opcao;
    private Boolean certo;
    @ManyToOne
    @JoinColumn(name = "questao_id")
    private Questao questao;

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public Boolean isCerto() {
        return certo;
    }

    public void setCerto(Boolean certo) {
        this.certo = certo;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Resposta() {
    }

    public Resposta(String opcao, Boolean certo, Questao questao) {
        this.opcao = opcao;
        this.certo = certo;
        this.questao = questao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.opcao);
        hash = 97 * hash + Objects.hashCode(this.certo);
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
        final Resposta other = (Resposta) obj;
        if (!Objects.equals(this.opcao, other.opcao)) {
            return false;
        }
        if (!Objects.equals(this.certo, other.certo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resposta{" + "opcao=" + opcao + ", certo=" + certo + '}';
    }
    
    
    
}
