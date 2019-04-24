package dao;

import model.User;

import java.util.List;

/*classe de dao de usuário que herda os métodos genericos da classe dao generica*/
public class UserDao extends GenericDao<User, Integer> {
    /*construtor que passa a classe para o dao generico se adaptar*/
    protected UserDao() {
        super(User.class);
    }
    /*método para buscar os usuários por nivel de permissão*/
    protected List<User> getByPermissionLevel(String permissionLevel){
        /*retorna uma lista de usuários que são de um determinado nivel de permissao*/
        return em.createQuery("select u from User u where u.permissionLevel = :permissionLevel",
                User.class).setParameter("permissionLevel",permissionLevel).getResultList();
    }
    /*método para buscar um usuário pelo login*/
    protected User getByLogin(String login){
        /*retorna o usuário de acordo com o login*/
        return em.createQuery("select u from User u where u.login = :login", User.class)
                .setParameter("login", login).getSingleResult();
    }

}
