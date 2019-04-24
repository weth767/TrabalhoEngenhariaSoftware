package dao;

import model.Unity;
/*classe de dao da unidade que herda os métodos genericos da classe de dao generico*/
public class UnityDao extends GenericDao<Unity, Integer> {
    /*construtor que seta a classe para o dao generico se adaptar*/
    protected UnityDao() {
        super(Unity.class);
    }
    /*método para buscar uma unidade pelo seu nome*/
    protected Unity getByName(String name){
        /*retorna a unidade de acordo com seu nome*/
        return em.createQuery("select u from Unity u where u.name = :name", Unity.class)
                .setParameter("name", name).getSingleResult();
    }
    /*método para buscar uma unidade pela sua sigla*/
    protected Unity getByInitials(String initials){
        return em.createQuery("select u from Unity u where u.initials = :initials", Unity.class)
                .setParameter("initials", initials).getSingleResult();
    }
}
