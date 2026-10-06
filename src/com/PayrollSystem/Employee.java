package com.PayrollSystem;


public class Employee {

    private long employeeId;
    private String name;
    private double basicSalary;
    private double allowance;
    private double deductions;

    public Employee(long employeeId, String name, double basicSalary,
                    double allowance, double deductions) {

        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deductions = deductions;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
}

