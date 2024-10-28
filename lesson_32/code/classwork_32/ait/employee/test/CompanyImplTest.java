package classwork_32.ait.employee.test;

import classwork_32.ait.employee.dao.Company;
import classwork_32.ait.employee.dao.CompanyImpl;
import classwork_32.ait.employee.model.Employee;
import classwork_32.ait.employee.model.Manager;
import classwork_32.ait.employee.model.SalesManager;
import classwork_32.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {
        // create object
        company = new CompanyImpl(5);
        // fill array to fill object company
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 170, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 165, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);

        // TODO поместить объекты emp[] в объект company с помощью метода addEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }

    }

    @Test
    @DisplayName("add Employee test is working")
    void addEmployeeTest() {
        // check size
        assertEquals( 4, company.quantity());
        // can't add null
        assertFalse(company.addEmployee(null));
        // can't add duplicate
        assertFalse(company.addEmployee(emp[1]));
        // can add new one employee
        Employee newEmp = new Worker(5, "N5", "L5", 160, 20);
        assertTrue(company.addEmployee(newEmp));
        // check size
        assertEquals(5, company.quantity());
        // can't add one more employee
        Employee oneMoreEmp = new Worker(6, "N6", "L6", 160, 20);
        assertFalse(company.addEmployee(oneMoreEmp));
    }

    @Test
    void removeEmployeeTest() {
        // can remove existed
        assertEquals( emp[1], company.removeEmployee(2));
        // check size
        assertEquals( 3, company.quantity() );
        // can't remove absent
        assertNull(company.removeEmployee(7));
    }

    @Test
    void findEmployeeTest() {
        // find existed
        assertEquals( emp[2], company.findEmployee(3));
        // find absent
        assertNull(company.findEmployee(7));
    }

    @Test
    @DisplayName("Update employee is working...")
    void updateEmployeeTest() {
        Employee updatedEmployee = new SalesManager (2, "N2", "New2Name", 170, 55000, 0.1);
        assertEquals("New2Name" ,company.updateEmployee(updatedEmployee).getSecondName());
        // assertEquals((55000, company.updateEmployee((SalesManager)updatedEmployee));
        company.printEmployee();
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();
        // методы типа void не проверяются с помощью assert...
    }

    @Test
    void totalSalaryTest() {
        double totalSalary = 29200;
        assertEquals(totalSalary, company.totalSalary());

    }

    @Test
    void totalSalesTest() {
        assertEquals(130000, company.totalSales());
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
        Employee[] expected = {emp[1], emp[2]};
        Employee[] actual = company.findEmployeeHoursGreaterThan(160);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeeSalaryRangeTest() {
        Employee[] expected = {emp[0], emp[1], emp[3]};
        Employee[] actual = company.findEmployeeSalaryRange(3000, 10000);
        assertArrayEquals(expected, actual);

    }
}

