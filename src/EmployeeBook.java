import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employee = new Employee[10];


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
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department && min > employee[i].getSalary()) {

                min = employee[i].getSalary();
                }
            }


        return min;
    }

    public double maxDepartment(int department) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department && max < employee[i].getSalary()) {
                max = employee[i].getSalary();

            }
        }
        return max;
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


            }
        }
    }


    public void listWithoutDepartment(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getDepartament() == department) {

                System.out.println("Имя " + employee[i].getName() + " , зарплата " +
                        employee[i].getSalary() + " , id = " + employee[i].getId());

            }
        }
    }


    public void salaryLessNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < number) {

                System.out.println(" , id = " + employee[i].getId() + "Имя " +
                        employee[i].getName() + " , зарплата " + employee[i].getSalary());

            }
        }
    }


    public void salaryMoreNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() >= number) {

                System.out.println(" , id = " + employee[i].getId() + "Имя " +
                        employee[i].getName() + " , зарплата " + employee[i].getSalary());


            }
        }
    }

    public void addEmployee(String name, int department,
                            double salary) {
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null) {
                employee[i] = new Employee(name, department, salary);
                break;
            }

        }
    }

    public void deleteEmployee(String name, int id) {
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null) {
                continue;
            }

            if (employee[i].getName().equals(name) && employee[i].getId() == id) {
                employee[i] = null;
            }
        }
    }

    public void upgradeEmployee(String name, double index,
                                int department) {
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getName().equals(name)) {
                employee[i].setSalary(employee[i].getSalary() * index);
                employee[i].setDepartament(department);


            }
        }
    }


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

}
