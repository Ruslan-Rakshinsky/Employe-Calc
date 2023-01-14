package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employees implements IEmployeeInfo {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void Input() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String name = br.readLine();
                String personalNumber = br.readLine();
                int workingHours = Integer.parseInt(br.readLine());
                float rate = Float.parseFloat(br.readLine());

                employeeList.add(new Employee(name, personalNumber, workingHours, rate));
            }


        } catch (NumberFormatException | IOException exception) {
            System.out.println("You've entered the value in a wrong format!");
            System.exit(1);
        }
    }

    @Override
    public void Display() {
        for (Employee e: employeeList) {
            System.out.print(e.getName() +", ");
            System.out.print(e.getPersonalNumber() +", ");
            System.out.print(e.getWorkingHours() + ", ");
            System.out.println(e.getRate());
        }
        System.out.println("\n" + AvgSalary());

    }

    @Override
    public float AvgSalary() {
        float sum = 0;
        for (Employee e :
                employeeList) {
            sum += e.getSalary();
        }
        return sum / employeeList.size();
    }
}
