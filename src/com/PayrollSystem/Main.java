package com.PayrollSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PayrollSystem payrollSystem = new PayrollSystem();

        while (true) {

            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Generate Salary Slip");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    long employeeId = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = scanner.nextDouble();

                    System.out.print("Enter Allowance: ");
                    double allowance = scanner.nextDouble();

                    System.out.print("Enter Deductions: ");
                    double deductions = scanner.nextDouble();

                    Employee employee = new Employee(
                            employeeId,
                            name,
                            basicSalary,
                            allowance,
                            deductions
                    );

                    payrollSystem.addEmployee(employee);

                    break;


                case 2:

                    payrollSystem.displayEmployees();

                    break;


                case 3:

                    System.out.print("Enter Employee ID: ");
                    long salaryEmployeeId = scanner.nextLong();

                    System.out.print("Enter Tax Rate (%): ");
                    double taxRate = scanner.nextDouble();

                    payrollSystem.generateSalarySlip(
                            salaryEmployeeId,
                            taxRate
                    );

                    break;


                case 4:

                    System.out.print("Enter Employee ID: ");
                    long searchId = scanner.nextLong();

                    Employee foundEmployee =
                            payrollSystem.findEmployee(searchId);

                    if (foundEmployee != null) {

                        System.out.println("\nEmployee Found");
                        System.out.println(
                                "Employee ID: "
                                        + foundEmployee.getEmployeeId()
                        );
                        System.out.println(
                                "Name: "
                                        + foundEmployee.getName()
                        );

                    } else {

                        System.out.println("Employee not found.");
                    }

                    break;


                case 5:

                    System.out.println(
                            "Thank you for using Employee Payroll System."
                    );

                    scanner.close();

                    return;


                default:

                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }
        }
    }
}
