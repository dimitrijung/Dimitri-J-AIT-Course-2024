package classwork_45.employee_save_read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl {

    public static void main(String[] args) {

    Address address = new Address("Lviv", "Beststreet1", 8,2,79000);
    Address address1 = new Address("Lviv1", "Beststreet2", 9,3,79000);

    Employee e1 = new Employee(1, "Dima", LocalDate.of(2000,04,01), 5900, address);
    Employee e2 = new Employee(2, "Anton", LocalDate.of(2000,04,02), 5800, address1);

    Set<Employee> firma = new HashSet<>();

    firma.add(e1);
    firma.add(e2);

    // otpravljaem v file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {

            oos.writeObject(firma);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
