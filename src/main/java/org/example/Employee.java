package org.example;

public class Employee {
    private final String name;
    private final int workingHours;
    private final float rate;
    private float salary;
    private final String personalNumber;

    public Employee(String name, int workingHours, float rate, String personalNumber) {
        this.name = name;
        this.workingHours = workingHours;
        this.rate = rate;
        this.personalNumber = personalNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public float getRate() {
        return rate;
    }

    public float getSalary() {
        return salary;
    }
}
