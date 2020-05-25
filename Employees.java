package com.example.demo;

public class Employees {
    private String empId;
    private String name;
    private String dob;
    private String salary;
    private String location;
    private String married;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        dob = dob;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public Employees(String empId, String name, String dob, String salary, String location, String married) {
        super();
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.location = location;
        this.married=married;
     }
}
