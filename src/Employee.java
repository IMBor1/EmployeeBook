public class Employee {
    static int count;
    private String name;
    private int departament;
    private double salary;
    private int id;

    public Employee(String name, int departament, double salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + " ," +
                " departament = " + departament +
                ", salary=" + salary +
                ", id=" + id;

    }
}
