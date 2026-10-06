package com.PayrollSystem;
import java.util.ArrayList;

import java.util.List;


public class PayrollSystem {

	    private List<Employee> employees;

	    public PayrollSystem() {
	        employees = new ArrayList<>();
	    }


	    // 1. ADD EMPLOYEE
	    public void addEmployee(Employee employee) {

	        for (Employee emp : employees) {

	            if (emp.getEmployeeId() == employee.getEmployeeId()) {

	                System.out.println("Employee with this ID already exists.");
	                return;
	            }
	        }

	        employees.add(employee);

	        System.out.println("Employee added successfully.");
	    }


	    // 2. FIND EMPLOYEE
	    public Employee findEmployee(long employeeId) {

	        for (Employee emp : employees) {

	            if (emp.getEmployeeId() == employeeId) {
	                return emp;
	            }
	        }

	        return null;
	    }


	    // 3. CALCULATE GROSS SALARY
	    public double calculateGrossSalary(Employee employee) {

	        return employee.getBasicSalary() + employee.getAllowance();
	    }


	    // 4. CALCULATE TAX
	    public double calculateTax(Employee employee, double taxRate) {

	        double grossSalary = calculateGrossSalary(employee);

	        return grossSalary * taxRate / 100;
	    }


	    // 5. CALCULATE NET SALARY
	    public double calculateNetSalary(Employee employee, double taxRate) {

	        double grossSalary = calculateGrossSalary(employee);

	        double tax = calculateTax(employee, taxRate);

	        return grossSalary - tax - employee.getDeductions();
	    }


	    // 6. GENERATE SALARY SLIP
	    public void generateSalarySlip(long employeeId, double taxRate) {

	        Employee employee = findEmployee(employeeId);

	        if (employee == null) {

	            System.out.println("Employee not found.");
	            return;
	        }

	        double grossSalary = calculateGrossSalary(employee);
	        double tax = calculateTax(employee, taxRate);
	        double netSalary = calculateNetSalary(employee, taxRate);

	        System.out.println("\n========== SALARY SLIP ==========");
	        System.out.println("Employee ID      : " + employee.getEmployeeId());
	        System.out.println("Employee Name    : " + employee.getName());
	        System.out.println("---------------------------------");
	        System.out.println("Basic Salary     : " + employee.getBasicSalary());
	        System.out.println("Allowance        : " + employee.getAllowance());
	        System.out.println("Gross Salary     : " + grossSalary);
	        System.out.println("Tax              : " + tax);
	        System.out.println("Other Deductions : " + employee.getDeductions());
	        System.out.println("---------------------------------");
	        System.out.println("Net Salary       : " + netSalary);
	        System.out.println("=================================");
	    }


	    // 7. DISPLAY ALL EMPLOYEES
	    public void displayEmployees() {

	        if (employees.isEmpty()) {

	            System.out.println("No employee records found.");
	            return;
	        }

	        System.out.println("\n========== EMPLOYEE RECORDS ==========");

	        for (Employee employee : employees) {

	            System.out.println("Employee ID : " + employee.getEmployeeId());
	            System.out.println("Name        : " + employee.getName());
	            System.out.println("Basic Salary: " + employee.getBasicSalary());
	            System.out.println("Allowance   : " + employee.getAllowance());
	            System.out.println("Deductions  : " + employee.getDeductions());

	            System.out.println("--------------------------------------");
	        }
	    }
	}
