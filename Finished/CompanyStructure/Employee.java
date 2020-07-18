package Module3.CompanyStructure;

abstract class Employee {
    double baseSalary;
    String name;
    int ID;
    String status;
    private static int countEmployee;
    double bonus;
    Employee manager;

    // Constructors
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        countEmployee ++;
        ID = countEmployee;
    }

    public Employee(String name) {
        super();
        this.name = name;
    }

    // Getters, toString and abstract methods
    public Employee getManager() {
        return this.manager;
    }
    abstract public String employeeStatus();

    @Override
    public String toString() {
        return this.ID + " " + this.name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return ID;
    }

    public boolean equals(Employee other) {
        return this.ID == other.ID;
    }

}
