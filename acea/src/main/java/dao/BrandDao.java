package dao;

import exception.ServiceException;
import model.Brand;
/*classe de dao da marca que herda a classe generica de dao*/
public class BrandDao extends GenericDao<Brand, Integer>{
    /*contrutor da classe para invocar os métodos da classe pia*/
    protected BrandDao() {
        /*e passa a classe com qual trabalha*/
        super(Brand.class);
    }

    /*método para buscar retornar uma marca pelo seu nome*/
    protected Brand getByName(String name) throws ServiceException {
        /*cria a query para retornar uma unica marca de acordo com seu nome*/
        Brand b = em.createQuery("select b from Brand b where b.name = :name",Brand.class)
                .setParameter("name", name).getSingleResult();
        return b;
    }
}
