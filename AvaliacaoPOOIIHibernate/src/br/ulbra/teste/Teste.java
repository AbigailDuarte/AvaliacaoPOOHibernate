
package br.ulbra.teste;
import br.ulbra.model.bean.Aula;
import br.ulbra.model.dao.AulaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
/**
 *
 * @author 55519
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Aula aula = new Aula();
        AulaDAO dao = new AulaDAO();
 
        aula.setNome("marciolllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
        aula.setAnoNasc(2003);
        aula.setP1(7);
        aula.setP2(8);
        //aula.setId(3);
        dao.salvar(aula);
        
    }
    
}
