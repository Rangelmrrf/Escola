/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.dao;

import java.util.List;
import javax.persistence.EntityManager;
import rangelmrrf.escola.model.Aula;
import rangelmrrf.escola.model.Materia;

/**
 *
 * @author fp01ajweb8
 */
public class AulaDAO extends GenericDAO<Aula>{

    public AulaDAO() {
        super(Aula.class);
    }
    
    public List<Aula> buscarAulaMateria(Materia m){
         EntityManager em = factory.createEntityManager();
        return em.createQuery("SELECT a FROM Aula a WHERE a.materia = :m").setParameter("m", m).getResultList();

    }
    
}
