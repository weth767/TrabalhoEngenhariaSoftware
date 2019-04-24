package dao;

import model.Role;
/*classe de dao da função, que herda os métodos genericos do generic dao*/
public class RoleDao extends GenericDao<Role, Integer> {
    /*construtor passa a classe para o dao generico se adaptar*/
    protected RoleDao() {
        super(Role.class);
    }
    /*método para retornar a função pelo nome dela*/
    protected Role getByName(String name){
        /*retorna a função de acordo com o nome*/
        return em.createQuery("select r from Role r where r.name = :name", Role.class)
                .setParameter("name", name).getSingleResult();
    }
}
