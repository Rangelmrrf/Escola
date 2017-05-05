
import rangelmrrf.escola.model.Documento;
import rangelmrrf.escola.model.Endereco;
import rangelmrrf.escola.model.Pessoa;
import rangelmrrf.escola.model.Rg;
import rangelmrrf.escola.model.Titulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author fp01ajweb8
 */
public class TestaPessoa {
    
    public static void main(String[] args){
        
        Rg rg = new Rg("470338","15/12/2015","COMAER");
        Titulo t = new Titulo("123412341234", "0110", "198");
        Documento d = new Documento("22222222220", t, rg);
        Endereco e = new Endereco("Rua", "H27D", "123", "", "Campus do CTA", "São José dos Campos", "São Paulo", "Brasil", "12228640");
        
        Pessoa p = new Pessoa();
        
        p.setNome("Juca");
        p.setEmail("juca@gmail.com");
        p.setDataNascimento("20/12/1990");
        p.setDocumento(d);

        
        
        System.out.println(p);
               
    }
    
}
