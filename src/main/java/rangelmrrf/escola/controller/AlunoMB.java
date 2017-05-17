/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelmrrf.escola.controller;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import rangelmrrf.escola.dao.AlunoDAO;
import rangelmrrf.escola.model.Aluno;
import rangelmrrf.escola.model.Documento;
import rangelmrrf.escola.model.Rg;
import rangelmrrf.escola.model.Titulo;

/**
 *
 * @author fp01ajweb8
 */
@Named
@RequestScoped
public class AlunoMB {
    private Aluno aluno;
    private Documento documento;
    private Titulo titulo;
    private AlunoDAO alunoDao;

    

    public AlunoMB() {
        aluno = new Aluno();
        documento = new Documento();
        documento.setRg(new Rg());
        documento.setTitulo(new Titulo());
        alunoDao = new AlunoDAO();
    }
    
    
    
    public String criarNovo() {
        
        return "alunos";
    }
     public String salvar() {
         aluno.setDocumento(documento);
         alunoDao.salvar(aluno);
         System.out.println(aluno);
        return "alunos";
    }

    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
}
