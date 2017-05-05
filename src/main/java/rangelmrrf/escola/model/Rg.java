/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangelmrrf.escola.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author fp01ajweb8
 */
@Embeddable
public class Rg implements Serializable{

    private String numeroRg;
    private String dataEmissao;
    private String emissor;

    public Rg(String numero, String dataEmissao, String emissor) {
        this.numeroRg = numero;
        this.dataEmissao = dataEmissao;
        this.emissor = emissor;
    }

    public Rg() {
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Rg other = (Rg) obj;
        if (!Objects.equals(this.numeroRg, other.numeroRg)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rg{" + "numero=" + numeroRg + ", dataEmissao=" + dataEmissao + ", emissor=" + emissor + '}';
    }

}
