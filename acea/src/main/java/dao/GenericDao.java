package dao;

import connection.Connect;
import exception.ServiceException;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;
/*classe dao generica que reduzirá o tamanho dos outros daos*/
public abstract class GenericDao<T, I extends Serializable> {
    /*gerenciador de entidades*/
    protected EntityManager em;
    /*variavel da classe generica*/
    private Class<T> entityClass;
    /*construtor que passará a classe para a variavel e criará a conexão com o banco*/
    protected GenericDao(Class<T> entityClass){
        em = Connect.getConnection();
        this.entityClass = entityClass;
    }
    /*método para salvar a classe generica*/
    protected void save(T entity) throws ServiceException {
        /*cria a transação para garantir o salvamento*/
        em.getTransaction().begin();
        /*salva a entidade*/
        em.merge(entity);
        /*e finaliza a transação confirmando o save*/
        em.getTransaction().commit();
    }
    /*método para atualizar a classe generica*/
    protected void update(T entity) throws ServiceException{
        /*cria a transação para garantir a atualização*/
        em.getTransaction().begin();
        /*atualiza a entidade*/
        em.merge(entity);
        /*da um flush no banco*/
        em.flush();
        /*e finaliza a transação confirmando o update*/
        em.getTransaction().commit();
    }
    /*método para buscar todos os cadastrados da classe abstrata*/
    protected List<T> getAll(){
        /*construi uma query de acordo com a classe que virá*/
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(entityClass);
        query.from(entityClass);
        /*e retorna a lista*/
        return em.createQuery(query).getResultList();
    }
    /*método para buscar um item da classe generica de acordo com seu id*/
    protected T get(I id){
        /*retorna essa item*/
        return em.find(entityClass, id);
    }
    /*método para remover um item da classe abstrata*/
    protected T remove(I id) throws ServiceException{
        /*busca a entidade pelo seu id*/
        T entity = get(id);
        /*inicia a transação para garantir a remoção*/
        em.getTransaction().begin();
        /*remove a entidade*/
        em.remove(entity);
        /*da flush no banco*/
        em.flush();
        /*e finaliza a transação*/
        em.getTransaction().commit();
        /*no fim retorna a entidade*/
        return entity;
    }
}
