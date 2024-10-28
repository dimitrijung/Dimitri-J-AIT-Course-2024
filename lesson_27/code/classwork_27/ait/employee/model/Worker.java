package classwork_27.ait.employee.model;

// - создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
//      - Manager: base + grade*hours
//      - SalesManager: salesValue * percent
//      *****- Worker: grade*hours *****

import classwork_32.ait.employee.model.Employee;

public class Worker extends Employee {

    private int grade;

//---constructor---
    public Worker(int id, String name, String secondName, double hours, int grade) {
        super(id, name, secondName, hours);
        this.grade = grade;
    }

//---getters and setters---
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = grade * hours;
        return ensureSalary(salary);
    }

}// end of class
