public class Employee {
    private final int employeeId;
    private int employeeSalary;
    private String fullName;
    private int departmentId;

    private static int counterId = 1;

    public Employee(int employeeSalary, String fullName, int departmentId) {
        this.employeeId = counterId++;
        this.employeeSalary = employeeSalary;
        this.fullName = fullName;
        this.departmentId = departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                ", fullName='" + fullName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
