import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employee = new Employee[10];


<<<<<<< HEAD
    public void listAll() {
        System.out.println(Arrays.toString(employee));
    }

    public double salary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public double minSalary() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
            }
        }

        return min;
    }

    public double maxSalary() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }

            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
            }
        }
        return max;
    }

    public double middleSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum += employee[i].getSalary();
        }
        return sum / employee.length;
    }

    public void allNames() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            System.out.println(employee[i].getName());
        }
    }

    public void salaryIndexing(double index) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            employee[i].setSalary(employee[i].getSalary() * index);

        }
    }

    public double minDepartment(int department) {
        double min = 10000000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department && min > employee[i].getSalary()) {
                min = employee[i].getSalary();
                if (min > employee[i + 1].getSalary()) {
                    min = employee[i + 1].getSalary();
                }
            }

        }
        return min;
    }

    public double maxDepartment(int department) {
        double max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department && max > employee[i].getSalary()) {
                max = employee[i].getSalary();
                if (max > employee[i + 1].getSalary()) {
                    max = employee[i + 1].getSalary();
=======
    public void listAll(Employee[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void salary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println(sum);
    }

    public void minSalary(Employee[] arr) {
        double min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i].getSalary();
            if (arr[i].getSalary() > arr[i + 1].getSalary()) {
                min = arr[i + 1].getSalary();
            }
        }
        System.out.println(min);
    }

    public void maxSalary(Employee[] arr) {
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

    public void middleSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println(sum / arr.length);
    }

    public void allNames(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
    }

    public void salaryIndexing(Employee[] arr, double index) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].setSalary(arr[i].getSalary() * index);

        }
    }

    public double minDepartment(Employee[] arr, int department) {
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

    public double maxDepartment(Employee[] arr, int department) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department && max > arr[i].getSalary()) {
                max = arr[i].getSalary();
                if (max > arr[i + 1].getSalary()) {
                    max = arr[i + 1].getSalary();
>>>>>>> origin/emb
                }
            }

        }
        return max;
    }

<<<<<<< HEAD
    public double salaryDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public double middleSalaryDepartment(int department) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {
                count++;
                sum += employee[i].getSalary();
            }
        }
        return sum / count;
    }

    public void salaryIndexingOfDepartment(int department, double index) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {
                employee[i].setSalary(employee[i].getSalary() * index);
=======
    public void salaryDepartment(Employee[] arr, int department) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на выплату зарплат в департаменте " +
                department + " равна " + sum);
    }

    public void middleSalaryDepartment(Employee[] arr, int department) {
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

    public void salaryIndexingOfDepartment(Employee[] arr, int department, double index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {
                arr[i].setSalary(arr[i].getSalary() * index);
>>>>>>> origin/emb

            }
        }
    }

<<<<<<< HEAD
    public void listWithoutDepartment(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {

                System.out.println("Имя " + employee[i].getName() + " , зарплата " +
                        employee[i].getSalary() + " , id = " + employee[i].getId());
=======
    public void listWithoutDepartment(Employee[] arr, int department) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {

                System.out.println("Имя " + arr[i].getName() + " , зарплата " +
                        arr[i].getSalary() + " , id = " + arr[i].getId());
>>>>>>> origin/emb
            }
        }
    }

<<<<<<< HEAD
    public void salaryLessNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < number) {

                System.out.println(" , id = " + employee[i].getId() + "Имя " +
                        employee[i].getName() + " , зарплата " + employee[i].getSalary());
=======
    public void salaryLessNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
>>>>>>> origin/emb
            }
        }
    }

<<<<<<< HEAD
    public void salaryMoreNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() >= number) {

                System.out.println(" , id = " + employee[i].getId() + "Имя " +
                        employee[i].getName() + " , зарплата " + employee[i].getSalary());
=======
    public void salaryMoreNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
>>>>>>> origin/emb
            }
        }
    }

    public void addEmployee(String name, int department, double salary) {
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null) {
                employee[i] = new Employee(name, department, salary);
                break;
            }

        }
    }

    public void deleteEmployee(String name, int id) {
        for (int i = 0; i < employee.length; i++) {
<<<<<<< HEAD
            if (employee[i] == null) {
                continue;
            }
=======
>>>>>>> origin/emb
            if (employee[i].getName().equals(name) && employee[i].getId() == id) {
                employee[i] = null;
            }
        }
    }

    public void upgradeEmployee(String name, double index, int department) {
        for (int i = 0; i < employee.length; i++) {
<<<<<<< HEAD
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getName().equals(name)) {
                employee[i].setSalary(employee[i].getSalary() * index);
                employee[i].setDepartament(department);
=======
            if (employee[i].getName().equals(name)) {
                employee[i].setSalary(employee[i].getSalary() * index);
                if (employee[i].getDepartament() <= 4) {
                    employee[i].setDepartament(employee[i].getDepartament() + 1);
                } else {
                    employee[i].setDepartament(employee[i].getDepartament() - 1);
                }
>>>>>>> origin/emb

            }
        }
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employee=" + Arrays.toString(employee) +
                '}';
    }

    public void allNamesByDepartment(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {
                System.out.println(employee[i]);
            }
        }
    }

    /*  public void nameEmployeesByDepartament() {
=======

    public void nameEmployeesByDepartament() {
>>>>>>> origin/emb
        Employee[] dep1 = new Employee[10];
        Employee[] dep2 = new Employee[10];
        Employee[] dep3 = new Employee[10];
        Employee[] dep4 = new Employee[10];
        Employee[] dep5 = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
<<<<<<< HEAD
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == 1) {
                for (int j = 0; j < dep1.length; j++) {
                    if (employee[i] == null) {
                        continue;
                    }
=======
            if (employee[i].getDepartament() == 1) {
                for (int j = 0; j < dep1.length; j++) {
>>>>>>> origin/emb
                    dep1[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 2) {
                for (int j = 0; j < dep2.length; j++) {
<<<<<<< HEAD
                    if (employee[i] == null) {
                        continue;
                    }
=======
>>>>>>> origin/emb
                    dep2[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 3) {
                for (int j = 0; j < dep3.length; j++) {
<<<<<<< HEAD
                    if (employee[i] == null) {
                        continue;
                    }
=======
>>>>>>> origin/emb
                    dep3[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 4) {
                for (int j = 0; j < dep4.length; j++) {
<<<<<<< HEAD
                    if (employee[i] == null) {
                        continue;
                    }
=======
>>>>>>> origin/emb
                    dep4[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 5) {
                for (int j = 0; j < dep5.length; j++) {
<<<<<<< HEAD
                    if (employee[i] == null) {
                        continue;
                    }
=======
>>>>>>> origin/emb
                    dep5[i] = new Employee(employee[i].getName());
                }
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(dep1));
        System.out.println(Arrays.toString(dep2));
        System.out.println(Arrays.toString(dep3));
        System.out.println(Arrays.toString(dep4));
        System.out.println(Arrays.toString(dep5));
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> origin/emb
}
