import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("vasya", 1, 40000);
        employee[1] = new Employee("petya", 3, 65000);
        employee[2] = new Employee("artem", 5, 80000);
        employee[3] = new Employee("sasha", 2, 50000);
        employee[4] = new Employee("ilya", 4, 60000);
        employee[5] = new Employee("gosha", 3, 72000);
        employee[6] = new Employee("oleg", 2, 68000);
        employee[7] = new Employee("kolya", 5, 78000);
        employee[8] = new Employee("pasha", 3, 64000);
        employee[9] = new Employee("vanya", 1, 570000);
        listWithoutDepartment(employee, 5);
    }

    public static void listAll(Employee[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void salary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println(sum);
    }

    public static void minSalary(Employee[] arr) {
        double min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i].getSalary();
            if (arr[i].getSalary() > arr[i + 1].getSalary()) {
                min = arr[i + 1].getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Employee[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp;
            max = arr[i].getSalary();
            if (arr[i].getSalary() < arr[i + 1].getSalary()) {
                max = arr[i + 1].getSalary();
            }
        }
        System.out.println(max);
    }

    public static void middleSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println(sum / arr.length);
    }

    public static void allNames(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
    }

    public static void salaryIndexing(Employee[] arr, double index) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].setSalary(arr[i].getSalary() * index);

        }
    }

    public static double minDepartment(Employee[] arr, int department) {
        double min = 10000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department && min > arr[i].getSalary()) {
                min = arr[i].getSalary();
                if (min > arr[i + 1].getSalary()) {
                    min = arr[i + 1].getSalary();
                }
            }

        }
        return min;
    }

    public static double maxDepartment(Employee[] arr, int department) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department && max > arr[i].getSalary()) {
                max = arr[i].getSalary();
                if (max > arr[i + 1].getSalary()) {
                    max = arr[i + 1].getSalary();
                }
            }

        }
        return max;
    }

    public static void salaryDepartment(Employee[] arr, int department) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на выплату зарплат в департаменте " +
                department + " равна " + sum);
    }

    public static void middleSalaryDepartment(Employee[] arr, int department) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {
                count++;
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Средняя зарплата в департаменте " +
                department + " равна " + sum / count);
    }

    public static void salaryIndexingOfDepartment(Employee[] arr, int department, double index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {
                arr[i].setSalary(arr[i].getSalary() * index);

            }
        }
    }

    public static void listWithoutDepartment(Employee[] arr, int department) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {

                System.out.println("Имя " + arr[i].getName() + " , зарплата " +
                        arr[i].getSalary() + " , id = " + arr[i].getId());
            }
        }
    }

    public static void salaryLessNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
            }
        }
    }

    public static void salaryMoreNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
            }
        }
    }
}
