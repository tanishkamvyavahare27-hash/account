// Account.java (POJO class)
package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private int id;
    private String name;
    private int bal;
    private String address;
    @Column(name="date_of_creation")
    private int dateofcreation;
    @Column(name="acc_type")
    private String accType;
    private int min_balance;
    private String status;

    public Account() {
		
	}
	public Account(int id, String name, int bal, String address, int dateofcreation, String accType,
			int min_balance, String status) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
		this.address = address;
		this.dateofcreation =dateofcreation;
		this.accType = accType;
		this.min_balance = min_balance;
		this.status = status;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }
    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfCreation() {
        return dateofcreation;
    }
    public void setDateOfCreation(int dateOfCreation) {
        this.dateofcreation = dateOfCreation;
    }

    public String getAcc_type() {
        return accType;
    }
    public void setAcc_type(String accType) {
        this.accType = accType;
    }

    public int getMin_balance() {
        return min_balance;
    }
    public void setMin_balance(int min_balance) {
        this.min_balance = min_balance;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
	
   
}