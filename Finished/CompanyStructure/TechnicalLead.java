package Module3.CompanyStructure;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    // Fields
    ArrayList<SoftwareEngineer> directReports = new ArrayList<>();
    int headCount;
    BusinessLead lead;
    Accountant supportTeam;

    // Constructor
    public TechnicalLead(String name) {
        super(name);
        baseSalary *= 1.3;
        headCount = 4;
    }



    public boolean hasHeadCount() {
        return directReports.size() < this.headCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            directReports.add(e);
            e.manager = this;
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        return e.manager == this && e.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (lead.approveBonus(e, bonus)) {
            e.baseSalary += bonus;
            return true;
        }
        return false;
    }

    @Override
    public String employeeStatus() {
        return (this.ID + " " + this.name + " has " + checkIns + " successful check ins" + "\n");
    }

    public void getTeamStatus() {
        if (this.directReports.isEmpty()) {
            System.out.println(this.employeeStatus() + " and no direct reports yet \n");
        }
        else {
            System.out.println(this.employeeStatus() + " and is managing: ");
            for (SoftwareEngineer softwareEngineer : this.directReports) {
                System.out.println(softwareEngineer.employeeStatus());
            }
        }
    }




}