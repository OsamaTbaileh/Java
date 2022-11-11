package com.axsos.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=1, message="Name must not be blank")
	private String name;
	
	@NotNull
	@Size(min=1, message="Vendor must not be blank")
	private String vendor;
	
	@NotNull
	@Min(value=(long) 0.000001, message="Amount must not be blank")
	private double amount;
	
	@NotNull
	@Size(min=1, message="Description must not be blank")
	private String description;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
//	constructor:
	public Expense() {
	}

	public Expense(String name, String vendor, double amount, String description) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	
//	getters:
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVendor() {
		return vendor;
	}

	public double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	
//	setters:
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
}
