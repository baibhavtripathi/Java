package io.tribty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable {
    public static final long serialVersionUID = 4L;
    public int empId;
    public String empName;
    public double salary;
    public LocalDate dateOfBirth;
    public boolean isPermanent;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public Employee(int empId, String empName, double salary, LocalDate dateOfBirth, boolean isPermanent) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.isPermanent = isPermanent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(employee.salary, salary) == 0 && isPermanent == employee.isPermanent && empName.equals(employee.empName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary, dateOfBirth, isPermanent);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                ", isPermanent=" + isPermanent +
                '}';
    }
}
