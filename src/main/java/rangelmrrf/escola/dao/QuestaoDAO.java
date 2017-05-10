/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangelmrrf.escola.dao;

import java.util.List;
import javax.persistence.EntityManager;
import rangelmrrf.escola.model.Aula;
import rangelmrrf.escola.model.Questao;

/**
 *
 * @author fp01ajweb8
 */
public class QuestaoDAO extends GenericDAO<Questao> {

    public QuestaoDAO() {
        super(Questao.class);
    }
    

    public List<Questao> buscaQuestaoAula(Aula a) {

        EntityManager em = factory.createEntityManager();
        return em.createQuery("SELECT q FROM Questao q WHERE q.aula = :a").setParameter("a", a).getResultList();

    }

}
