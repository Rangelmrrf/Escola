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
public class Titulo {

    private String numero;
    private String secao;
    private String zona;

    public Titulo(String numero, String secao, String zona) {
        this.numero = numero;
        this.secao = secao;
        this.zona = zona;
    }

    
    public Titulo() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
@Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.numero);
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
        final Titulo other = (Titulo) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulo{" + "numero=" + numero + ", secao=" + secao + ", zona=" + zona + '}';
    }

}
