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

/**
 *
 * @author fp01ajweb8
 */
public class GenericDAO<T> {
    
    EntityManagerFactory factory;
    
    private Class<T> clazz;

    public GenericDAO(Class<T> clazz) {
         factory = Persistence.createEntityManagerFactory("escola");
         this.clazz = clazz;
    }
    
    public T salvar(T a) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(a);
        tx.commit();
        em.close();
        return a;
    }
    
    public T buscar(Integer id){
        EntityManager em = factory.createEntityManager();
        T a = em.find(clazz, id);
        em.close();
        return a;
        
        
    }
    
    public T excluir(Integer id){
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        T a = buscar(id);
        if (a != null){
            em.remove(a);
            
        }
        tx.commit();
        em.close();
        return a;
    }
    
     public void atualizar(T a) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(a);
        tx.commit();
        em.close();
    }
}

