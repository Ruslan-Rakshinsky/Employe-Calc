package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees implements IEmployeeInfo {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void Input() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++){
                employeeList.add(new Employee(scanner.nextLine(), scanner.nextInt(), scanner.nextFloat(), scanner.nextLine()));
            }


        } catch (NumberFormatException exception) {

        }
    }

    @Override
    public void Display() {
    }

    @Override
    public void AvgSalary() {

    }
}
