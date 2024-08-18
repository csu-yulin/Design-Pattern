package 行为型模式.访问者模式;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new FulltimeEmployee("小明", 3000, 50);
        Employee employee2 = new ParttimeEmployee("小华", 20, 50);

        EmployeeList employeeList = new EmployeeList();
        employeeList.add(employee1);
        employeeList.add(employee2);

        Department faDepartment = new FADepartment();
        Department hrDepartment = new HRDepartment();

        employeeList.accept(faDepartment);
        employeeList.accept(hrDepartment);
    }
}
