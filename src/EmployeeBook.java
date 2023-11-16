import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employee = new Employee[10];


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
                }
            }

        }
        return max;
    }

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

            }
        }
    }

    public void listWithoutDepartment(Employee[] arr, int department) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartament() == department) {

                System.out.println("Имя " + arr[i].getName() + " , зарплата " +
                        arr[i].getSalary() + " , id = " + arr[i].getId());
            }
        }
    }

    public void salaryLessNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
            }
        }
    }

    public void salaryMoreNumber(Employee[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= number) {

                System.out.println(" , id = " + arr[i].getId() + "Имя " +
                        arr[i].getName() + " , зарплата " + arr[i].getSalary());
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
            if (employee[i].getName().equals(name) && employee[i].getId() == id) {
                employee[i] = null;
            }
        }
    }

    public void upgradeEmployee(String name, double index, int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getName().equals(name)) {
                employee[i].setSalary(employee[i].getSalary() * index);
                if (employee[i].getDepartament() <= 4) {
                    employee[i].setDepartament(employee[i].getDepartament() + 1);
                } else {
                    employee[i].setDepartament(employee[i].getDepartament() - 1);
                }

            }
        }
    }


    public void nameEmployeesByDepartament() {
        Employee[] dep1 = new Employee[10];
        Employee[] dep2 = new Employee[10];
        Employee[] dep3 = new Employee[10];
        Employee[] dep4 = new Employee[10];
        Employee[] dep5 = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartament() == 1) {
                for (int j = 0; j < dep1.length; j++) {
                    dep1[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 2) {
                for (int j = 0; j < dep2.length; j++) {
                    dep2[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 3) {
                for (int j = 0; j < dep3.length; j++) {
                    dep3[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 4) {
                for (int j = 0; j < dep4.length; j++) {
                    dep4[i] = new Employee(employee[i].getName());
                }
            } else if (employee[i].getDepartament() == 5) {
                for (int j = 0; j < dep5.length; j++) {
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
    }
}
