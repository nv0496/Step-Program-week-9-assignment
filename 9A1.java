class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Arun", 50000);
        Employee e2 = new Employee(102, "Meera", 60000);
        System.out.println(e1);
        System.out.println(e1.getClass().getName());
        System.out.println(e2);
        System.out.println(e2.getClass().getName());
    }
}
