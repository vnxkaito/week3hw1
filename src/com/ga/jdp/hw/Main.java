package com.ga.jdp.hw;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    private List<Employee> employees = Arrays.asList(new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), (double)68109.0F, "Male"), new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), (double)87846.0F, "Female"), new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), (double)95035.0F, "Male"), new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), (double)37210.0F, "Female"), new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), (double)48450.0F, "Male"), new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), (double)74416.0F, "Male"));

    private <E> void printList(List<E> list) {
    }

    public void getEmployeesOver50k() {
        List<Employee> employees = null;
    }

    public void getEmployeeNamesHiredAfter2012() {
        List<String> employees = null;
    }

    public void getMaxSalary() {
        double max = (double)0.0F;
        System.out.println("Max:" + max);
    }

    public void getMinSalary() {
        double min = (double)0.0F;
        System.out.println("Min:" + min);
    }

    public void getAverageSalaries() {
        double averageFemale = (double)0.0F;
        double averageMale = (double)0.0F;
        System.out.println("Averages: Female:" + averageFemale);
        System.out.println("Averages: Male:" + averageMale);
    }

    public void getMaximumPaidEmployee() {
        Employee highest = null;
    }

    public static void main(String[] args) {
    }
}
