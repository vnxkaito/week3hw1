package com.ga.jdp.hw;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    static AtomicInteger IDGenerator = new AtomicInteger(0);
    private int id;
    private String name;
    private LocalDate hireDate;
    private Double salary;
    private final String gender;

    public Employee(String name, LocalDate hireDate, Double salary, String gender) {
        this.id = IDGenerator.incrementAndGet();
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public Double getSalary() {
        return this.salary;
    }

    public String getGender(){
        return this.gender;
    }

    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + "', hireDate=" + this.hireDate + ", salary=" + this.salary + ", gender=" + this.gender + "}";
    }
}

