package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connect {

    private static EntityManagerFactory emFactory =
            Persistence.createEntityManagerFactory("ACEA_Persistence");
    private static EntityManager em;

    private Connect() {
    }

    public static EntityManager getConnection(){
        if(em == null){
            em = emFactory.createEntityManager();
        }
        return em;
    }
}
