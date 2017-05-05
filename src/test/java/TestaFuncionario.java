
import org.junit.Test;
import rangelmrrf.escola.dao.FuncionarioDAO;
import rangelmrrf.escola.model.Documento;
import rangelmrrf.escola.model.Endereco;
import rangelmrrf.escola.model.Funcionario;
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
public class TestaFuncionario {
    @Test
    public void testaFuncionario(){
        
         Funcionario f = new Funcionario();
        f.setNome("Juca");
        f.setEmail("juca@jucf.com");
        f.setDataNascimento("02/02/2000");
        f.setCargo("Faxineiro");
        Endereco e = new Endereco("Rua", "H27D", "123", "", "Campus do CTA", "São José dos Campos", "São Paulo", "Brasil", "12228640");
        f.setEndereco(e);
        Rg rg = new Rg("470338","15/12/2015","COMAER");
        Titulo t = new Titulo("123412341234", "0110", "198");
        Documento d = new Documento("22222222220", t, rg);
        f.setDocumento(d);
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.salvar(f);
        System.out.println(f);
        
    }
    
}
