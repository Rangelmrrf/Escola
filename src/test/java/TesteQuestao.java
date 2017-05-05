
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import rangelmrrf.escola.dao.QuestaoDAO;
import rangelmrrf.escola.model.Questao;
import rangelmrrf.escola.model.Resposta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fp01ajweb8
 */
public class TesteQuestao {
    
    @Test
    public void testaQuestao(){
        Questao q = new Questao();
        q.setPergunta("Quem descobriu o Brasil?");
        Resposta r1 = new Resposta("Critovão Colombo", false, q);
        Resposta r2 = new Resposta("Pedro Alvares Cabral", true, q);
        Resposta r3 = new Resposta("Silvio Santos", false, q);
        Resposta r4 = new Resposta("Antonio Carlos Jobin", false, q);
        List<Resposta> respostas = new ArrayList<>();
        respostas.add(r1);
        respostas.add(r2);
        respostas.add(r3);
        respostas.add(r4);
        q.setRespostas(respostas);
        QuestaoDAO dao = new QuestaoDAO();
        dao.salvar(q);
        System.out.println(q);
    }
    
}
