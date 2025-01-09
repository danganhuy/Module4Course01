package huy.module4course01.service;

import huy.module4course01.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<Customer>();customers.add(new Customer(1, "Nguyen Van A", "nguyenvana@example.com", "Hanoi"));
        customers.add(new Customer(2, "Tran Thi B", "tranthib@example.com", "Danang"));
        customers.add(new Customer(3, "Le Van C", "levanc@example.com", "Ho Chi Minh City"));
        customers.add(new Customer(4, "Pham Thi D", "phamthid@example.com", "Hue"));
        customers.add(new Customer(5, "Hoang Van E", "hoangvane@example.com", "Nha Trang"));
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
