package classwork_27.ait.employee.dao;

// - добавление сотрудника +      addEmployee
//- нахождение сотрудника по id + findEmployee
//- обновление cотрудника +       updateEmployee
//- удаление сотрудника +         removeEmployee
//- печать списка сотрудников +   printEmployee
//- кол-во сотрудников +          quantity
//- объем всех зарплат "ФОТ"      totalSalary
//- объем продаж                  totalSales

import classwork_32.ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee (int id);

    Employee findEmployee(int id);

    Employee updateEmployee(Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary();

    double totalSales();

    Employee[] findEmployeeHoursGreaterThan (int hours);

    Employee[] findEmployeeSalaryRange(double min, double max);


}// end of class
