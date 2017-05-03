/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.model;

/**
 *
 * @author fp01ajweb8
 */
public class Instrutor extends Pessoa{

    public Instrutor() {
    }

    public Instrutor(int id, String nome, String email, String dataNascimento, Documento documento, Endereco endereco) {
        super(id, nome, email, dataNascimento, documento, endereco);
    }

    @Override
    public String toString() {
        return "Instrutor{" + '}';
    }
    
    
    
}
