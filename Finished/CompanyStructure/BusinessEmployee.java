package Module3.CompanyStructure;

abstract public class BusinessEmployee extends Employee {
    double budget;
    double bonusBudget;

    public BusinessEmployee(String name) {
        super(name,50000);
    }

    public double getBonusBudget() {
        return budget;
    }

    public String employeeStatus() {
        return(this.ID + " " + this.name + " with a budget of " + budget + "\n");
    }
}
