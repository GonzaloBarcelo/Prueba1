package src.main.java.isw21.controler;

import java.util.ArrayList;

import src.main.java.isw21.dao.CustomerDAO;
import src.main.java.isw21.domain.Customer;

public class CustomerControler {

    public void getCustomer(ArrayList<Customer> lista) {
        CustomerDAO.getClientes(lista);
    }
}