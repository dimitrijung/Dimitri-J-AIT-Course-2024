package classwork_16.employee.model;

// создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//
//  - создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

public class Employee {

    // fields
    private int id;
    private String name;
    private String lastname;
    private double salary;
    private boolean gender;

    // constructor
    public Employee(int id, String name, String lastname, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.gender = gender;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public String displayEmployee (){
        return String.format("ID: %d, name: %s, lastname: %s, salary: %.2f, gender: %s", id, name, lastname, salary, gender);
    }

}// end
