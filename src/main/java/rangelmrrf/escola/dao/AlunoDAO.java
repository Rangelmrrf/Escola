/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rangelmrrf.escola.model.Aluno;

/**
 *
 * @author fp01ajweb8
 */
public class AlunoDAO {
    
    EntityManagerFactory factory;

    public AlunoDAO() {
         factory = Persistence.createEntityManagerFactory("escola");
         
    }
    
    public Aluno salvar(Aluno a) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(a);
        tx.commit();
        em.close();
        return a;
    }
    
    public Aluno buscar(Integer id){
        EntityManager em = factory.createEntityManager();
        Aluno a = em.find(Aluno.class, id);
        em.close();
        return a;
        
        
    }
    
    public Aluno excluir(Integer id){
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Aluno a = buscar(id);
        if (a != null){
            em.remove(a);
            
        }
        tx.commit();
        em.close();
        return a;
    }
    
     public void atualizar(Aluno a) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(a);
        tx.commit();
        em.close();
    }
}
