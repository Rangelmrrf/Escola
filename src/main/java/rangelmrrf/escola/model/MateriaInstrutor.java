/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fp01ajweb8
 */
@Embeddable
public class MateriaInstrutor implements  Serializable{
    
    @ManyToOne
    @JoinColumn(name = "INSTRUTOR_ID")
    private Instrutor instrutor;

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    @Override
    public String toString() {
        return "MateriaInstrutor{" + "instrutor=" + instrutor + '}';
    }
    
}
