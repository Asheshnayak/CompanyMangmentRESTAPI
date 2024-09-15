package com.jsp.company_managment.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;

@Column(name="name" ,nullable=false)
private String name;

@Column(name="email",nullable=false,unique=true)
private String email;

@Column(name="phone",nullable=false,unique=true)
private Long phone;
@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private Set<Bill> bills=new HashSet<>();
}
