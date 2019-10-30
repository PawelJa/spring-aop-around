package com.spring.aopdemo.dao;

import com.spring.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    // add a new method
    public List<Account> findAccounts(boolean tripWire) {

        // for academic purpose... simualte an exception
        if (tripWire) {
            throw new RuntimeException("No soup for you !!!");
        }

        List<Account> accounts = new ArrayList<>();

        // create sample accounts
        Account account1 = new Account("John", "Silver");
        Account account2 = new Account("Madhu", "Platinum");
        Account account3 = new Account("Luca", "Gold");

        // add them to our accounts list
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        return accounts;
    }

    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
