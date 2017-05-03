/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.util.Objects;

/**
 *
 * @author fp01ajweb8
 */
public class Resposta {
    
    private String opcao;
    private Boolean certo;
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
        return "Resposta{" + "opcao=" + opcao + ", certo=" + certo + ", questao=" + questao + '}';
    }
    
    
    
}
