public class Main {
    public static void main(String[] args) {
            Employee emp = new Employee("Anne", "James", "2 Somewhere str","210 1234567", "Accounting", 700.00);
            SalesEmployee salesemp = new SalesEmployee("Kostas", "Mezani", "21 Kotzia str", "6946945592","IT", 1000,500,1.5);

        System.out.printf("Name: %s %s\nAddress: %s\nTelephone number: %s\nDepartment: %s\nSalary for this month: %.2f\n",
                emp.getFirstName(),emp.getLastName(),emp.getAddress(),emp.getTelephoneNumber(),emp.getDepartment(),emp.getMonthlySalary());

        System.out.println();

        System.out.printf("Name: %s %s\nAddress: %s\nTelephone number: %s\nDepartment: %s\nSalary for this month: %.2f\n",
                salesemp.getFirstName(),salesemp.getLastName(),salesemp.getAddress(),salesemp.getTelephoneNumber(),salesemp.getDepartment(),salesemp.getTotalMonthlySalary());

        System.out.println();
    }
}