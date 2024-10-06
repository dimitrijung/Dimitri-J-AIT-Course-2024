package classwork_16.employee;

import classwork_16.employee.model.Employee;

public class FirmaAppl {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Dimitri", "Jungbludt", 6000, true);
        Employee e2 = new Employee(2,"Anton", "Jungbludt", 5000, true);
        Employee e3 = new Employee(3,"Nina", "Jungbludt", 3500, false);

        System.out.println(e1.displayEmployee());
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        System.out.println("Total salary = " + totalSalary);

        Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        System.out.println("Total salary = " + totalSalary);

        e3.setSalary(10000);
        System.out.println(e3.displayEmployee());


    }

}
