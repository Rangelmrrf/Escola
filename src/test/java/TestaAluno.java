

import org.junit.Test;
import rangelmrrf.escola.dao.AlunoDAO;
import rangelmrrf.escola.model.Aluno;
import rangelmrrf.escola.model.Documento;
import rangelmrrf.escola.model.Endereco;
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
public class TestaAluno {
    
    @Test
    public void testAluno() throws Exception {
        Aluno a = new Aluno();
        a.setNome("Juca");
        a.setEmail("juca@juca.com");
        a.setDataNascimento("02/02/2000");
        a.setRegistroAluno("1/2017");
        Endereco e = new Endereco("Rua", "H27D", "123", "", "Campus do CTA", "São José dos Campos", "São Paulo", "Brasil", "12228640");
        a.setEndereco(e);
        Rg rg = new Rg("470338","15/12/2015","COMAER");
        Titulo t = new Titulo("123412341234", "0110", "198");
        Documento d = new Documento("22222222220", t, rg);
        a.setDocumento(d);
        AlunoDAO dao = new AlunoDAO();
        dao.salvar(a);
        System.out.println(a);
    }
    
    
}
