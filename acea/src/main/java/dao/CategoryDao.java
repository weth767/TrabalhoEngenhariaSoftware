package dao;

import model.Category;
/*classe de dao da categoria que herda os métodos do pai de dao generico*/
public class CategoryDao extends GenericDao<Category, Integer>{
    /*construtor da classe de categoria dao, que passa a classe de categoria para o pai*/
    protected CategoryDao() {
        super(Category.class);
    }

    /*método para buscar uma categoria por seu nome*/
    protected Category getByName(String name) {
        /*cria a query para retornar a categoria pelo nome(lembrando que os nomes são unicos*/
        return em.createQuery("select c from Category c where c.name = :name", Category.class)
                .setParameter("name", name).getSingleResult();
    }
}
