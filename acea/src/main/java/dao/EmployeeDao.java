package dao;

import model.Employee;
/*classe de dao do funcionario, que herda os métodos genericos de dao */
public class EmployeeDao extends GenericDao<Employee, Integer> {
    /*construtor da classe, que passa para o pai, qual classe ele utiliza
    * para o dao generico se adaptar*/
    protected EmployeeDao() {
        super(Employee.class);
    }
    /*método para */
    protected Employee getByCpf(String cpf){
        return em.createQuery("select e from Employee e where e.cpf = :cpf", Employee.class)
                .setParameter("cpf", cpf).getSingleResult();
    }
}
