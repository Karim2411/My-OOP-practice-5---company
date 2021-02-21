package Assignment5;

public class Salary {
    private int Director = 10*1000;
    private int Admin = 7*1000;
    private int BackEndManager = 5*1000;
    private int FrontEndManager = 4*1000;
    private int BackEndProgrammer = 3*1000;
    private int FrontEndProgrammer = 2*1000;

    public int getDirector() {
        return Director;
    }

    public void setDirector(int director) {
        Director = director;
    }

    public int getAdmin() {
        return Admin;
    }

    public void setAdmin(int admin) {
        Admin = admin;
    }

    public int getBackEndManager() {
        return BackEndManager;
    }

    public void setBackEndManager(int backEndManager) {
        BackEndManager = backEndManager;
    }

    public int getFrontEndManager() {
        return FrontEndManager;
    }

    public void setFrontEndManager(int frontEndManager) {
        FrontEndManager = frontEndManager;
    }

    public int getBackEndProgrammer() {
        return BackEndProgrammer;
    }

    public void setBackEndProgrammer(int backEndProgrammer) {
        BackEndProgrammer = backEndProgrammer;
    }

    public int getFrontEndProgrammer() {
        return FrontEndProgrammer;
    }

    public void setFrontEndProgrammer(int frontEndProgrammer) {
        FrontEndProgrammer = frontEndProgrammer;
    }

    public int Counter(){
        int TotalCost;
        TotalCost = Director + Admin + BackEndManager + FrontEndManager + BackEndManager + FrontEndProgrammer;
        return TotalCost*=1000;
    }
}

