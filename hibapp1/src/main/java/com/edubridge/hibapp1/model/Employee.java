package com.edubridge.hibapp1.model;

import java.sql.Timestamp;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

// This class is techinically called Entity or POJO Plain hold Java Object,
//  DTO : Data Transfer Object,
// VO : Value Object,
// Are Called Model, 
// Domain Class.
// Here We need to add Annotation as Entity class.

@Entity
@Table(name="Employee_Details003")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY) Purpose of it is :
	// it is used to generate auto id values for every primary key in table.
	
	@CreationTimestamp
	private Timestamp createDateTime; // used to display cration time date.
	
	@UpdateTimestamp
	private Timestamp updateDateTime;
	
	@Version
	private int versionNo; // used to get how many times the update happened.
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	//Write Delete All Class.
}
