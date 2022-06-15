package library.presistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO<T> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPA-LibraryDaoPU");
    protected EntityManager em = EMF.createEntityManager();

    protected void conect() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    protected void disconect() {

        if (em.isOpen()) {
            em.close();
        }
    }

    protected void save(T objet) {
        conect();
        em.getTransaction().begin();
        em.persist(objet);
        em.getTransaction().commit();
        disconect();

    }
    
    protected void update(T object){
        conect();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        disconect();
    }
    
    public T delete(T object) throws Exception{
    
        try {
            conect();
            T object1 = em.merge(object);
            em.getTransaction();
            em.remove(object1);
            em.getTransaction().commit();
            disconect();
        } catch (Exception e) {
            
        }
        return object;
    }

}
