package Task3;

public class Salary {
    public float calculateMonthlySalary(float salary, int workHours){
        float monthly;
        monthly = (salary*workHours)*4;
        return monthly;
    }

    public float calculateYearlySalary(float salary, int workHours){
        float yearly;
        yearly = ((salary*workHours)*4)*12;
        return yearly;
    }
}
