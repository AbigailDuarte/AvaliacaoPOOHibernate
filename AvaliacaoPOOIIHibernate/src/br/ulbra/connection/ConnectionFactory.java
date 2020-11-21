
package br.ulbra.connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 55519
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory emf = Persistence .createEntityManagerFactory("AvaliacaoPOOIIHibernate");

    public EntityManager getConnection() {
        return emf.createEntityManager();
    }
    
}
