package ru.eerror;

public class Employee {
    private final String name;
    private final int workingHours;
    private final float rate;
    private final String personalNumber;

    public Employee(String name,String personalNumber, int workingHours, float rate) {
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
        return rate * workingHours;
    }
}
