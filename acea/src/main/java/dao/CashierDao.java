package dao;

import model.Cashier;
import java.util.List;
/*classe de dao do caixa que herda do dao generico*/
public class CashierDao extends GenericDao<Cashier, Integer>{
    /*construtor da classe que recebe a classe de caixa*/
    protected CashierDao() {
        super(Cashier.class);
    }

    /*método para buscar todos os caixas de uma data*/
    protected List<Cashier> getByDate(String date){
        /*retorna a lista de caixas abertos naquele dia*/
        return em.createQuery("select c from Cashier c where c.date = :date",Cashier.class)
                .setParameter("date",date).getResultList();
    }

}
