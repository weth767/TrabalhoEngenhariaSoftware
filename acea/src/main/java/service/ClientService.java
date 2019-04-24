package service;

import dao.ClientDao;
import exception.ServiceException;
import model.Client;
import util.CPFValidation;
import util.EmailValidation;

public class ClientService extends ClientDao {

    public void save(Client client) throws ServiceException {
        String error = "";
        if(CPFValidation.cpfValidation(client.getCpf()) == false)
            error += "CPF inválido\n";
        if(client.getName().isEmpty() || client.getName() == null)
            error += "Nome do cliente não pode ser vazio\n";
        if(client.getRg().isEmpty() && client.getRg() == null)
            error += "RG inválido\n";
        if(client.getBirthday() == null){
            error += "Data de nascimento deve ser preenchida\n";
        }
        if(EmailValidation.emailValidation(client.getEmail()) == false){
            error += "E-mail inválido\n";
        }

        if(error.equals("")){
            super.save(client);
        }
        else{
            throw new ServiceException("Erro: \n" + error);
        }
    }
}
