package dao;

import model.Client;

/*Classe dao do cliente que herda os métodos da classe generica*/
public class ClientDao extends GenericDao<Client, Integer>{
    /*no construtor da classe, passa o tipo de classe para o pai para adaptar os metodos de acordo com a classe*/
    protected ClientDao() {
        super(Client.class);
    }

    /*método para buscar um cliente pelo seu cpf*/
    protected Client getByCpf(String cpf){
        /*cria a query para retornar o cliente pelo seu cpf*/
        return em.createQuery("select c from Client c where c.cpf = :cpf", Client.class)
                .setParameter("cpf",cpf).getSingleResult();
    }


}
