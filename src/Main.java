public class Main {

    static Employee[] employees = new Employee[3];

    public static void main(String[] args) {
        employees[0] = new Employee("Alexander Pushkin", "writer", 80_000);
        employees[1] = new Employee("Amadeus Mozart", "Composer", 90_000);
        employees[2] = new Employee("Albert Einstein", "theoretical physicist", 100_000);
        System.out.println("\n Данные о сотрудниках");

        for (int a = 0; a <= employees.length - 1; a++) {
            System.out.println(employees[a]);
        }



        double sumSalary = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            sumSalary += employees[i].getSalary();
        }
        System.out.printf("Cумма затрат на ЗП: %s\n",sumSalary);

        double minSalary = employees[0].getSalary();
        int numberMinSalary = 0;

        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                numberMinSalary = i;
            }
        }
        System.out.printf("Cотрудника с минимальной ЗП %s\n", employees[numberMinSalary].toString());


        double maxSalary = employees[0].getSalary();
        int numberMaxSalary = 0;

        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() < maxSalary) {
                maxSalary = employees[i].getSalary();
                numberMaxSalary = i;
            }
        }
        System.out.printf("Cотрудника с максимальной ЗП %s\n", employees[numberMaxSalary].toString());


        double middleSalary = sumSalary / employees.length;
        System.out.printf("Cреднее значение зарплат\n", middleSalary);


    }


    }

