package vision;

import exception.ServiceException;
import model.Brand;
import model.City;
import model.Client;
import service.BrandService;
import service.CityService;
import service.ClientService;
import util.EmailValidation;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997,03,06);
        /*CityService cts = new CityService();
        try {
            List<City> cityList = cts.getByState("Paraná");
            for (City c: cityList){
                System.out.println(c.getName());
            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }*/
        /*Client c = new Client();
        c.setName("João Paulo de Souza");
        c.setCpf("10412561913");
        c.setRg("123456789");
        c.setBirthday(calendar.getTime());
        c.setGender("Masculino");
        try {
            c.setCity(cts.get(3558));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        c.setCep("87501690");
        c.setNeighborhood("Jardim Carolina");
        c.setStreet("Rua Mundo Novo");
        c.setNumber("3474");
        c.setComplement("Casa");
        c.setReference("Próximo ao Supermercado Ronqui");
        c.setPhone(null);
        c.setCellphone("37999655305");
        c.setEmail("joao_paulo767@hotmail.com");
        c.setRegisterDate(new Date());
        c.setWorkplace(null);
        c.setSalary(0);
        c.setStatus(true);

        ClientService cs = new ClientService();
        try {
            cs.save(c);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Cliente salvo com sucesso");*/
    }
}
