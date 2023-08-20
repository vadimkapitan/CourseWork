public class Main {

    private static final Employee[] employees = {
                new Employee(25000, "Иванов Иван Иванович", 1),
                new Employee(30000, "Алексеев Алексей Алеексеевич", 2),
                new Employee(45000, "Сидоров Сидр Сидорович", 3),
                new Employee(55000, "Григорьев Григорий Григорьевич", 4),
                new Employee(5000, "Денисов Денис Денисович", 5),
                new Employee(125000, "Никитин Никита Никитович", 1),
                new Employee(60000, "Степанов Степан Степанович", 2),
                new Employee(13000, "Петров Петр Петрович", 3),
                new Employee(44000, "Федоров Федор Федорович", 4),
                new Employee(65000, "Константинов Константин Константинович", 5),
        };

    public static void main(String[] args) {
        printEmployees();
        System.out.println("*************************");
        System.out.println("Сумма всех ЗП: " + findTotalSalaryMonth() + " руб.");
        System.out.println("*************************");
        System.out.println("Сотруник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("*************************");
        System.out.println("Сотруник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("*************************");
        System.out.println("Средняя ЗП: " + avarageSalary() + " руб.");
        System.out.println("*************************");
        printFullName();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int findTotalSalaryMonth() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getEmployeeSalary();
        }
        return sumSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary() < employeeWithMinSalary.getEmployeeSalary()) {
            employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary() > employeeWithMaxSalary.getEmployeeSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static float avarageSalary() {
        return findTotalSalaryMonth() / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}