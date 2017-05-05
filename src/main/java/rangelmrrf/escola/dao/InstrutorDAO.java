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
import rangelmrrf.escola.model.Instrutor;

/**
 *
 * @author fp01ajweb8
 */
public class InstrutorDAO {
    
    EntityManagerFactory factory;

    public InstrutorDAO() {
         factory = Persistence.createEntityManagerFactory("escola");
         
    }
    
    public Instrutor salvar(Instrutor i) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(i);
        tx.commit();
        em.close();
        return i;
    }
    
    public Instrutor buscar(Integer id){
        EntityManager em = factory.createEntityManager();
        Instrutor i = em.find(Instrutor.class, id);
        em.close();
        return i;
        
        
    }
    
    public Instrutor excluir(Integer id){
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Instrutor i = buscar(id);
        if (i != null){
            em.remove(i);
            
        }
        tx.commit();
        em.close();
        return i;
    }
    
     public void atualizar(Instrutor i) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(i);
        tx.commit();
        em.close();
    }
}
