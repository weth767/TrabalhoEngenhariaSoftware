package dao;

import model.Provider;
/*classe da dao do fornecedor que herda os métodos da classe generica de dao*/
public class ProviderDao extends GenericDao<Provider, Integer> {
    /*no construtor da classe, passa a classe de fornecedor para os métodos se adaptarem*/
    protected ProviderDao() {
        super(Provider.class);
    }
    /*método para buscar um fornecedor por um cnpj*/
    protected Provider getByCnpj(String cnpj){
        /*retorna o fornecedor de acordo com o cnpj*/
        return em.createQuery("select p from Provider p where p.cnpj = :cnpj", Provider.class)
                .setParameter("cnpj", cnpj).getSingleResult();
    }
    /*método para buscar um fornecedor por o razão social*/
    protected Provider getBySocialName(String socialName){
        /*retorna o fornecedor pelo razão social dele*/
        return em.createQuery("select p from Provider p where p.socialName = :socialName", Provider.class)
                .setParameter("socialName", socialName).getSingleResult();
    }
}
