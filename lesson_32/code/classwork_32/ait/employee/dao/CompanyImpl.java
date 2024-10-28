package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;
import classwork_32.ait.employee.model.SalesManager;

import java.util.Arrays;
import java.util.function.Predicate;

public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;

    // capacity- возможное количество сотрудников, которое мы позже можем вложить в эту capacity
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad case
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
        if (findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1];// на место жертвы ставим (копируем) последний элемент массива
                employees[size - 1] = null; //последний элемент массива затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
            // отыскать нужного в массиве и обновить ему поля, забирая их из employee
            for (int i = 0; i < size; i++) {
                if (employees[i].getId() == employee.getId()) {
//                employees[i].setSecondName(employee.getSecondName());
//                employees[i].setHours(employee.getHours());
                    employees[i] = employee;
                    return employees[i];
                }
            }
            return null;
        }

        @Override
        public int quantity() {
            return size;
        }

        @Override
        public void printEmployee () {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }

        @Override
        public double totalSalary () {
            double totalSalary = 0;
            for (int i = 0; i < size; i++) {
                totalSalary += employees[i].calcSalary();
            }
            return totalSalary;
        }

        @Override
        public double totalSales () {
            double totalSales = 0;
            for (int i = 0; i < size; i++) {
                if (employees[i] instanceof SalesManager) { // proverka pered kastingom
                    SalesManager sm = (SalesManager) employees[i];
                    totalSales += sm.getSalesValue();
                }
            }
            return totalSales;
        }

        @Override
        public Employee[] findEmployeeHoursGreaterThan ( int hours){
            return findEmployeeByPredicate(e -> e.getHours() > hours);
        }

        @Override
        public Employee[] findEmployeeSalaryRange ( double min, double max){
            return findEmployeeByPredicate(e -> e.calcSalary() > min && e.calcSalary() < max);
        }

        private Employee[] findEmployeeByPredicate (Predicate < Employee > predicate) {
            Employee[] res = new Employee[size];
            int j = 0; // это индексы массива результатов
            for (int i = 0; i < size; i++) {
                if (predicate.test(employees[i])) {
                    res[j++] = employees[i];
                }
            }
            return Arrays.copyOf(res, j); // обрезаем хвост из null
        }
}// end of class
