public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Alexander Pushkin", "writer", 80_000);
        Employee employee2 = new Employee("Amadeus Mozart", "Composer", 90_000);
        Employee employee3 = new Employee("Albert Einstein", "theoretical physicist", 100_000);
        System.out.println("\n Данные о сотрудниках");

        employee1.printEmployeeDetails();
        System.out.println("\n");

        employee2.printEmployeeDetails();
        System.out.println("\n");

        employee3.printEmployeeDetails();
        System.out.println("\n");









    }
}