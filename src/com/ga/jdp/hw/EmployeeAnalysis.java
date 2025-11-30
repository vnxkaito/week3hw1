package com.ga.jdp.hw;

import java.util.List;
import java.util.Optional;

public class EmployeeAnalysis {
    List<Employee> employees = null;

    private <E> void printList(List<E> list) {
        if(list != null){
            list.forEach(System.out::println);
        }
    }
    public void getEmployeesOver50k() {
        List<Employee> employees = null;
        printList(employees.stream().filter(employee -> employee.getSalary() > 50).toList());
    }
    public void getEmployeeNamesHiredAfter2012() {
        List<Employee> employees = null;
        printList(employees.stream().filter(employee -> employee.getHireDate().getYear() > 2012).toList());
    }
    public void getMaxSalary() {
        double max = 0;
        this.employees.stream().map(Employee::getSalary).max(Double::compare).get();//ref: https://www.geeksforgeeks.org/java/stream-max-method-java-examples/
        System.out.println("Max: " + max);
    }
    public void getMinSalary() {
        double min = this.employees.stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);
        System.out.println("Min:" + min);
    }
    public void getAverageSalaries() {
        double averageMale = 0;
        double averageFemale = 0;

        averageMale = (this.employees.stream()
                .filter(a -> a.getGender().equalsIgnoreCase("male"))
                .mapToDouble(Employee::getSalary)
                .sum() )/ (this.employees.stream()
                .filter(a -> a.getGender().equalsIgnoreCase("male"))
                .mapToDouble(Employee::getSalary)
                .count() );

        averageFemale = (this.employees.stream()
                .filter(a -> a.getGender().equalsIgnoreCase("female"))
                .mapToDouble(Employee::getSalary)
                .sum() )/ (this.employees.stream()
                .filter(a -> a.getGender().equalsIgnoreCase("female"))
                .mapToDouble(Employee::getSalary)
                .count() );

        System.out.println("Averages: Male: " + averageMale + " Female: " + averageFemale);
    }
    public void getMaximumPaidEmployee() {
        Employee highest = null;
        Double highestSal = this.employees.stream().map(Employee::getSalary).reduce(Double::max).orElse(null);
        highest = this.employees.stream().filter(a->a.getSalary() == highestSal).toList().get(0);
    }
}
