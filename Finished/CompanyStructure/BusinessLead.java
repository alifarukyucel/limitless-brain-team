package Module3.CompanyStructure;

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    int headCount = 10;
    ArrayList<Accountant> directReports = new ArrayList<Accountant>();

    public BusinessLead(String name) {
        super(name);
    }

    public boolean hasHeadCount() {
        return this.directReports.size() < this.headCount;
    }

    public boolean addReport(Accountant a, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            directReports.add(a);
            this.bonusBudget += 1.1*a.baseSalary;
            a.teamSupported = supportTeam;
            a.manager = this;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus <= this.budget) {
            e.baseSalary += bonus;
            budget -= bonus;
            return true;
        }
        return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (int i = 0; i < this.directReports.size(); i++)
            if (this.directReports.get(i).getTeamSupported() == e.getManager()) {
                requestBonus(e, bonus);
                return true;
            }
        return false;
    }

    public void getTeamStatus() {
        if (this.directReports.isEmpty()) {
            System.out.println(this.employeeStatus() + " and no direct reports yet \n");
        }
        else {
            System.out.println(this.employeeStatus() + " and is managing: ");
            for (Accountant accountant : this.directReports) {
                System.out.println(accountant.employeeStatus());
            }
        }

    }
}
