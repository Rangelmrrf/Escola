
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import rangelmrrf.escola.dao.AlunoDAO;
import rangelmrrf.escola.dao.InstrutorDAO;
import rangelmrrf.escola.dao.TurmaDAO;
import rangelmrrf.escola.model.Aluno;
import rangelmrrf.escola.model.Turma;
import rangelmrrf.escola.model.Turno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fp01ajweb8
 */
public class TestaTurma {
    
    @Test
    
    public void testeTurma(){
        Turma t= new Turma();
        t.setNome("karaidebota");
        t.setTurno(Turno.FIM_DE_SEMANA);
        List<Aluno> alunos = new ArrayList<>();
        AlunoDAO alunoDao = new AlunoDAO();
        Aluno a = alunoDao.buscar(6);
        a.setTurma(t);
        
        Aluno b = alunoDao.buscar(7);
        b.setTurma(t);
        
        Aluno c = alunoDao.buscar(8);
        c.setTurma(t);
        
        alunos.add(c);
        alunos.add(b);
        alunos.add(a);
        t.setAlunos(alunos);
        InstrutorDAO instrutorDao = new InstrutorDAO();
        t.setInstrutor(instrutorDao.buscar(1));
        TurmaDAO dao = new TurmaDAO();
        dao.salvar(t);

        System.out.println(t);
    }
    
    
    
}
