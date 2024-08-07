package com.techlabs.entry;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private List<Account> accounts;

    public Customer(int customer_id, String first_name, String last_name, String email, String password) {
        super();
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public Customer(int customer_id, String first_name, String last_name) {
        super();
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.accounts = new ArrayList<>();
    }

    public Customer(String email2, String f_name, String l_name, String pass) {
    	 
         this.first_name = f_name;
         this.last_name = l_name;
         this.email = email2;
         this.password = pass;
	}

	public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
                + ", email=" + email + ", password=" + password + "]";
    }
}
