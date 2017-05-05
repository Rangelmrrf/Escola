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
import rangelmrrf.escola.model.Funcionario;

/**
 *
 * @author fp01ajweb8
 */
public class FuncionarioDAO {
    
    EntityManagerFactory factory;

    public FuncionarioDAO() {
         factory = Persistence.createEntityManagerFactory("escola");
         
    }
    
    public Funcionario salvar(Funcionario f) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(f);
        tx.commit();
        em.close();
        return f;
    }
    
    public Funcionario buscar(Integer id){
        EntityManager em = factory.createEntityManager();
        Funcionario f = em.find(Funcionario.class, id);
        em.close();
        return f;
        
        
    }
    
    public Funcionario excluir(Integer id){
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Funcionario f = buscar(id);
        if (f != null){
            em.remove(f);
            
        }
        tx.commit();
        em.close();
        return f;
    }
    
     public void atualizar(Funcionario f) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(f);
        tx.commit();
        em.close();
    }
}
