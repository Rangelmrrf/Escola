
import org.junit.Test;
import rangelmrrf.escola.dao.AulaDAO;
import rangelmrrf.escola.dao.MateriaDAO;
import rangelmrrf.escola.model.Aula;
import rangelmrrf.escola.model.Materia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fp01ajweb8
 */
public class TestaMateria {
    @Test
    
    public void testaMateria(){
        
        Materia m = new Materia();
        m.setNome("História");
        m.setCargaHoraria("200 horas");
        MateriaDAO dao = new MateriaDAO();
        m = dao.salvar(m);
        AulaDAO aulaDao = new AulaDAO();
        Aula a = aulaDao.buscar(5);
        a.setMateria(m);
        aulaDao.atualizar(a);
        m.setAulas(aulaDao.buscarAulaMateria(m));
        
        System.out.println(m);
        
        
        
    }
    
}
