package com.jsp.company_managment.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bill_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;


@Column(name="descriotion",nullable=false)
private String description;


@Column(name="amount",nullable=false)
private Double amount;


@Column(name="date",nullable=false)
private LocalDate date;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="customer_id",nullable=false)
private Customer customer;
}
