package org.home.mazi.functionalprogramming.chapter3;

import java.util.Arrays;
import java.util.List;

public class Chapter3Video5 {
    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public static void main(String[] args) {
            Employee[] employeesArr = {
                    new Employee("john", 34,"developer",80_000f),
                    new Employee("Hannah", 24,"developer",95_000f),
                    new Employee("Bart", 50,"sales executive",100_000f),
                    new Employee("Sophie", 49,"constructor worker",40_000f),
                    new Employee("Darren", 38,"writer",50_000f),
                    new Employee("Nancy", 29,"developer",75_000f)
            };

            List<Employee> employeeList = Arrays.asList(employeesArr);

            float totalDeveloperSalaries = employeeList
                    .stream()
                    .filter(employee -> employee.jobTitle.equals("developer"))
                    .map(employee -> employee.salary)
                    .reduce(0f, Float::sum);

            long developer = employeeList
                    .stream()
                    .filter(employee -> employee.jobTitle.equals("developer"))
                    .count();

            System.out.println(totalDeveloperSalaries/developer);
        }
    }
}
