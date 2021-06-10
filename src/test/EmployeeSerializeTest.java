package test;

import model.Employee;
import model.PhoneNumber;
import service.EmployeeService;

public class EmployeeSerializeTest {


    public static void doSerialize(){
        Employee employee = new Employee("Sargis Ghazaryan",2000,"manager");
        employee.setPhoneNumber(new PhoneNumber("098","232323"));

        EmployeeService.serializeEmployee(employee);

    }


    public static void doDeSerialize() {
        Employee employee = EmployeeService.deSerializeEmployee();
        System.out.println(employee);
    }
}
