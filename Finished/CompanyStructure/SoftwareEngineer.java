package Module3.CompanyStructure;

public class SoftwareEngineer extends TechnicalEmployee {
    boolean codeAccess;
    int checkIn;
    TechnicalLead manager;

    public SoftwareEngineer(String name) {
        super(name);
        this.codeAccess = false;
        this.checkIn = 0;
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return checkIn;
    }


    public boolean checkInCode() {
        if (manager.approveCheckIn(this)) {
            checkIn ++;
            return true;
        }
        else {
            return false;
        }
    }

}