package com.kk.service;

import com.kk.dao.CustomerDaoImpl;
import com.kk.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public Customer saveData(Customer customer) {
        return customerDaoImpl.saveData(customer);
    }

    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    public Optional<Customer> getDataById(long custId) {
        return customerDaoImpl.getDataById(custId);
    }

    public Customer updateData(Customer customer) {
        return customerDaoImpl.updateData(customer);
    }

    public void deleteData(long custId) {
        customerDaoImpl.deleteData(custId);
    }
}
