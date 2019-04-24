package dao;

import exception.ServiceException;
import model.City;

import java.util.List;

/*classe de dao da cidade que herda os métodos da classe generica*/
public class CityDao extends GenericDao<City, Integer>{
    /*construtor da classe que seta a classe de cidade para o pai adaptar os métodos*/
    protected CityDao() {
        super(City.class);
    }

    /*método para buscar uma cidade pelo seu estado e nome*/
    protected City getByNameAndState(String city, String state) throws ServiceException {
        /*cria a query para retornar a cidade pelo seu nome e estado*/
        return em.createQuery("select c from City c where c.name = :city and c.stateName = :state", City.class)
                .setParameter("city", city).setParameter("state", state).getSingleResult();
    }
    /*método para buscar a lista de cidades por um estado*/
    protected List<City> getByState(String stateName) throws ServiceException {
        /*retorna a lista de cidade de um estado especifico*/
        return em.createQuery("select c from City c where c.stateName = :stateName", City.class)
                .setParameter("stateName", stateName).getResultList();
    }
}
