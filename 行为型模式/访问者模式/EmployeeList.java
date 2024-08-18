package 行为型模式.访问者模式;


import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private final List<Employee> employeeList = new ArrayList<>();

    public void add(Employee e) {
        employeeList.add(e);
    }

    public void remove(Employee e) {
        employeeList.remove(e);
    }

    public void accept(Department department) {
        for (Employee employee : employeeList) {
            employee.accept(department);
        }
    }
}
