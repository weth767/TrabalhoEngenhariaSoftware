package service;

import dao.CityDao;
import exception.ServiceException;
import model.City;

import java.util.List;

/*classe de service de cidade que herda os métodos do dao de cidade*/
public class CityService extends CityDao {
    /*construtor chama o construtor*/
    public CityService() {
        super();
    }
    /*método para salvar um cidade*/
    public void save(City city) throws ServiceException {
        /*cria a variavel de erro*/
        String error = "";
        /*caso ocorra algum erro, adiciona a string de erro*/
        if(city.getName().isEmpty() || city.getName() == null)
            error += "Nome da cidade deve ser preenchido\n";
        if(city.getStateName().isEmpty())
            error += "Nome do estado deve ser preenchido\n";
        if(city.getUf().isEmpty() || city.getUf() == null || city.getUf().length() != 2)
            error += "UF deve ser preenchido e deve ter apenas duas letras\n";
        /*verifica se houve algum erro*/
        if(error.equals("")){
            /*senão houve, salva a cidade*/
            super.save(city);
        }
        /*se houve erro*/
        else{
            /*leva a exceção e manda o erro*/
            throw new ServiceException("Erro: \n" + error);
        }
    }
    /*método para atualizar a cidade*/
    public void update(City city) throws ServiceException {
        /*cria a variavel de erro*/
        String error = "";
        /*caso ocorra algum erro, adiciona a string de erro*/
        if(city.getName().isEmpty() || city.getName() == null)
            error += "Nome da cidade deve ser preenchido\n";
        if(city.getStateName().isEmpty())
            error += "Nome do estado deve ser preenchido\n";
        if(city.getUf().isEmpty() || city.getUf() == null || city.getUf().length() != 2)
            error += "UF deve ser preenchido e deve ter apenas duas letras\n";
        /*verifica se houve algum erro*/
        if(error.equals("")){
            /*senão houve, atualiza a cidade*/
            super.update(city);
        }
        /*se houve erro*/
        else{
            /*leva a exceção e manda o erro*/
            throw new ServiceException("Erro: \n" + error);
        }
    }
    /*método buscar uma cidade pelo id*/
    public City get(int id) throws ServiceException {
        /*se o id for menor ou igual a 0, são códigos invalidos */
        if(id <= 0){
            /*então retorna exceção*/
            throw new ServiceException("Cidade não foi encontrada");
        }
        /*senão for, tenta buscar a cidade*/
        else{
            /*recebe a cidade*/
            City city = super.get(id);
            /*caso for igual a null, indica que tambem não encontrou a cidade*/
            if(city == null){
                /*então retorna exceção*/
                throw new ServiceException("Cidade não foi encontrada");
            }
            /*senão retorna a cidade*/
            return city;
        }
    }
    /*método para buscar uma cidade pelo seu nome e seu estado*/
    public City getByNameAndState(String city, String state) throws ServiceException {
        /*cria a string vazia de erro*/
        String error = "";
        /*verifica se o nome da cidade ou de estado são vazios*/
        if(city.isEmpty() || city == null)
            error += "Nome da cidade deve ser preenchida\n";
        if(state.isEmpty() || state == null){
            error += "Estado da cidade deve ser preenchido\n";
        }
        /*verifica se faltou alguma informação, senão faltou*/
        if(error.equals("")){
            /*busca a cidade pelo nome e pelo estado*/
            City c = super.getByNameAndState(city,state);
            /*se a cidade retornar null*/
            if(c == null){
                /*lança a exceção de que não encontrou a cidade*/
                throw new ServiceException("Cidade não foi encontrada");
            }
            /*senão*/
            else{
                /*retorna a cidade*/
                return c;
            }
        }
        /*caso haja erros*/
        else {
            /*lança a exceção com os erros*/
            throw new ServiceException("Erro: \n" + error);
        }
    }
    /*método para buscar uma lista de cidades por um estado*/
    public List<City> getByState(String stateName) throws ServiceException {
        /*verifica se os dados foram preenchidos*/
        if(stateName.isEmpty() || stateName == null){
            /*senão foi, levanta a exceção*/
            throw new ServiceException("O estado da cidade deve ser preenchido");
        }
        /*senão houver erros de falta de dados*/
        else{
            /*busca as cidades*/
            List<City> cities = super.getByState(stateName);
            /*verifica se a lista não retornou null*/
            if(cities == null){
                /*se retornou, levanta a exceção*/
                throw new ServiceException("Não foram encontradas cidades para este estado");
            }
            /*senão retornou, retorna as cidades*/
            return cities;
        }
    }
    /*método para buscar todas as cidade cadastradas*/
    public List<City> getAll(){
        /*retorna as cidades em forma de list*/
        return super.getAll();
    }
    /*método para remover uma cidade*/
    public City remove(int id) throws ServiceException {
        /*se o id for menor ou igual a 0, são códigos invalidos */
        if(id <= 0){
            /*então retorna exceção*/
            throw new ServiceException("Cidade não foi encontrada");
        }
        /*senão for, tenta buscar a cidade*/
        else{
            /*recebe a cidade*/
            City city = super.get(id);
            /*caso for igual a null, indica que tambem não encontrou a cidade*/
            if(city == null){
                /*então retorna exceção*/
                throw new ServiceException("Cidade não foi encontrada");
            }
            /*se encontrar a cidade, então a remove*/
            super.remove(id);
            /*depois retorna a cidade*/
            return city;
        }
    }
}
