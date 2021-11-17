package com.nttdata.bank.application;

import com.nttdata.bank.domain.Customer;

public interface CustomerOperation {
    public Customer listAll();
    public Customer add(Customer c);
    public Customer update(String id,Customer c);
    public void delete(String id);
}
