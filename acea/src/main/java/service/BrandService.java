package service;

import dao.BrandDao;
import exception.ServiceException;
import model.Brand;

import java.util.List;

/*classe de serviço da marca, onde estará as regras de negócio da classe*/
public class BrandService extends BrandDao {
    /*construtor da classe que invoca os métodos do pai*/
    public BrandService() {
        super();
    }

    /*método para salvar uma marca*/
    public void save(Brand b) throws ServiceException {
        /*verifica se o nome da marca não está vazio*/
        if(b.getName().isEmpty() || b.getName() == null){
            /*se estiver, joga uma exceção*/
            throw new ServiceException("Nome da marca não pode ser vazio ou nulo");
        }else{
            /*senão salva a marca*/
            super.save(b);
        }
    }
    /*método para atualizar uma marca*/
    public void update(Brand b) throws ServiceException{
        /*verifica se o nome da marca não está vazio*/
        if(b.getName().isEmpty() || b.getName() == null) {
            /*se estiver, joga uma exceção*/
            throw new ServiceException("Nome da marca não pode ser vazio ou nulo");
        }else{
            super.update(b);
        }
    }
    /*método para buscar uma marca pelo seu id*/
    public Brand get(int id) throws ServiceException{
        Brand b = null;
        /*verifica se o id é menor ou igual a 0*/
        if(id <= 0){
            /*se for lança a exceção*/
            throw new ServiceException("Código não existente, por favor digite outro código");
        }else{
            /*senão busca a marca pelo id*/
            b = super.get(id);
        }
        /*e a retorna*/
        return b;
    }
    /*método para retornar todas as marcas cadastradas*/
    public List<Brand> getAll(){
        return super.getAll();
    }
    /*método para buscar retornar uma marca pelo seu nome*/
    public Brand getByName(String name) throws ServiceException{
        if(name.isEmpty() || name == null)
            throw new ServiceException("Nome da marca não pode ser vazio");
        return super.getByName(name);
    }

    /*método para remover uma marca e retorna-la*/
    public Brand remove(int id) throws ServiceException{
        Brand b = null;
        /*verifica se o id é menor ou igual a 0*/
        if(id <= 0){
            /*se for lança a exceção*/
            throw new ServiceException("Código não existente, por favor digite outro código");
        }else{
            /*senão busca a marca pelo id*/
            b = super.get(id);
            super.remove(id);
        }
        /*e a retorna*/
        return b;
    }
}
