package dao;


import model.Purchase;

import java.util.List;

/*classe de dao da compra que herda da classe de dao em generica*/
public class PurchaseDao extends GenericDao<Purchase, Integer>{
    /*construtor da classe que seta a classe de compra para se adaptar a classe*/
    protected PurchaseDao() {
        super(Purchase.class);
    }
    /*método para retornar a lista de compras de um data especifica*/
    protected List<Purchase> getByDate(String date){
        /*retorna a lista de compras da data especifica*/
        return em.createQuery("select p from Purchase p where p.date = :date", Purchase.class)
                .setParameter("date", date).getResultList();
    }
    /*método para retornar uma compra pelo seu número da nota fiscal*/
    protected Purchase getByInvoice(int invoiceNumber){
        /*retorna a compra de acordo com seu número de nota fiscal*/
        return em.createQuery("select p from Purchase where p.invoiceNumber = :invoiceNumber",
                Purchase.class).setParameter("invoiceNumber", invoiceNumber).getSingleResult();
    }
}
