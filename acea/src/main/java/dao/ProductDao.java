package dao;


import model.Product;
/*classe de dao do produto que herda da classe generica de dao*/
public class ProductDao extends GenericDao<Product, Integer> {
    /*construtor da classe que passa a classe para o dao generico se adaptar*/
    protected ProductDao() {
        super(Product.class);
    }
    /*método para procurar um produto pelo seu nome*/
    protected Product getByName(String name){
        /*retorna o método de acordo com o nome*/
        return em.createQuery("select p from Product p where p.name = :name", Product.class)
                .setParameter("name",name).getSingleResult();
    }
}
