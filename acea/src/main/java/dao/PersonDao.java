package dao;

import model.Person;
/*classe de dao para as pessoas, que herda os métodos da classe de dao generica*/
public class PersonDao extends GenericDao<Person, Integer>{
    /*construtor da classe que passa a classe de pessoa para o dao generico se adaptar*/
    public PersonDao() {
        super(Person.class);
    }
}
