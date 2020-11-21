
package br.ulbra.model.dao;
import br.ulbra.connection.ConnectionFactory;
import br.ulbra.model.bean.Aula;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 55519
 */
public class AulaDAO {
    
     public void salvar(Aula aula) {


        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();

             if(aula.getId()==0){
               em.persist(aula);
            }else{
                 em.merge(aula);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public Aula deletar(Integer id){
          EntityManager em = new ConnectionFactory().getConnection();
          Aula aula = null;
        try {
           aula = em.find(Aula.class, id);
            em.getTransaction().begin();
            em.remove(aula);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return aula;
    }
        public Aula findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Aula aula = null;

        try {
            aula = em.find(Aula.class, id);//passa a classe e o id

        } catch (Exception e) {
            System.err.println(e);

        } finally {
            em.close();

        }
        return aula;

    }

public List<Aula> findAll(){
          EntityManager em = new ConnectionFactory().getConnection();
          List<Aula> categorias = null;
          try {
            categorias = em.createQuery("from Aula c").getResultList();
            
        } catch (Exception e) {
             System.err.println(e);
           
        }finally{
            em.close();
          }
          return categorias;
    }

    
}
