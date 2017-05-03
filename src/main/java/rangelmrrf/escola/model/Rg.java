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
public class Rg {

    private String numero;
    private String dataEmissao;
    private String emissor;

    public Rg(String numero, String dataEmissao, String emissor) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.emissor = emissor;
    }

    public Rg() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rg{" + "numero=" + numero + ", dataEmissao=" + dataEmissao + ", emissor=" + emissor + '}';
    }

}
