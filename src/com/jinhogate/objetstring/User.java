package com.jinhogate.objetstring;

import java.util.Objects;

public class User {

    private String name;
    private double salary;

    public User(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public User() {
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Double.compare(salary, user.salary) == 0 && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
