package Module3.CompanyStructure;

abstract public class TechnicalEmployee extends Employee {

    int checkIns;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    @Override
    public String employeeStatus() {
        return (this.ID + " " + this.name + " has " + checkIns + " successful check ins" + "\n");
    }

    public int checkIn() { return checkIns++; }
}