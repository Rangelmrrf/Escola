
import org.junit.Test;
import rangelmrrf.escola.dao.AlunoDAO;
import rangelmrrf.escola.dao.InstrutorDAO;
import rangelmrrf.escola.model.Instrutor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fp01ajweb8
 */
public class TestaInstrutor {
    
    @Test
    public void testInstrutor() throws Exception {
        Instrutor i = new Instrutor();
        i.setNome("Mario");
        i.setEmail("mario@mario.com");
        i.setDataNascimento("02/02/2000");
        InstrutorDAO dao = new InstrutorDAO();
        dao.salvar(i);
        System.out.println(i);
    }
    
}
