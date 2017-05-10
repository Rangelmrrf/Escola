
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import rangelmrrf.escola.dao.AulaDAO;
import rangelmrrf.escola.dao.QuestaoDAO;
import rangelmrrf.escola.model.Aula;
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
public class TestaAula {
    @Test
    public void testeAula(){
        
        Aula a = new Aula();
        a.setNome("História do Brasil");
        a.setCargaHoraria("20 horas");
        a.setConteudo("Mussum Ipsum, cacilds vidis litro abertis. Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis! Suco de cevadiss deixa as pessoas mais interessantis. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus.");
        AulaDAO aulaDao = new AulaDAO();
        aulaDao.salvar(a);
        Questao q = new Questao();
        q.setAula(a);
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
        a.setQuestoes(dao.buscaQuestaoAula(a));
        System.out.println(a);
        
    }
    
}
