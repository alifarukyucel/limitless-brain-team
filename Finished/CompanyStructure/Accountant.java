package Module3.CompanyStructure;

public class Accountant extends BusinessEmployee {
    TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        this.bonusBudget = 0;
        teamSupported = null;
    }

    public TechnicalLead getTeamSupported() {
        return this.teamSupported;
    }

    public void supportTeam(TechnicalLead lead) {
        if (this.teamSupported == null) {
            this.teamSupported = lead;
            double sum = 0;
            for (int i = 0; i < lead.directReports.size(); i++) {
                sum += lead.directReports.get(i).baseSalary;
            }
            this.bonusBudget = sum + sum*1/10;
        }
    }

    public boolean approveBonus(double bonus) {
        return bonus <= budget;
    }


    public String employeeStatus() {
        return(this.ID + " " + this.name + " with a budget of " + this.budget + this.bonusBudget + " is supporting ");
    }
}
