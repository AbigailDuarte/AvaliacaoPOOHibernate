
package br.ulbra.model.dao;
import br.ulbra.connection.ConnectionFactory;
import br.ulbra.model.bean.Lembrete;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 55519
 */
public class LembreteDAO {
    
         public void salvar(Lembrete lembrete) {


        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();

             if(lembrete.getIdLembrete()==0){
               em.persist(lembrete);
            }else{
                 em.merge(lembrete);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public Lembrete deletar(Integer idLembrete){
          EntityManager em = new ConnectionFactory().getConnection();
          Lembrete lembrete = null;
        try {
           lembrete = em.find(Lembrete.class, idLembrete);
            em.getTransaction().begin();
            em.remove(lembrete);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return lembrete;
    }
        public Lembrete findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Lembrete lembrete = null;

        try {
            lembrete = em.find(Lembrete.class, id);//passa a classe e o id

        } catch (Exception e) {
            System.err.println(e);

        } finally {
            em.close();

        }
        return lembrete;

    }

public List<Lembrete> findAll(){
          EntityManager em = new ConnectionFactory().getConnection();
          List<Lembrete> categorias = null;
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
