

import org.junit.Test;
import rangelmrrf.escola.dao.AlunoDAO;
import rangelmrrf.escola.model.Aluno;

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
        AlunoDAO dao = new AlunoDAO();
        dao.salvar(a);
        System.out.println(a);
    }
    
    
}
