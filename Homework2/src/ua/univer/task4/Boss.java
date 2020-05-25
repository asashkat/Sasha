package ua.univer.task4;

public class Boss extends Person implements Employee{
    private String department;
    private double rate;
    private int resultEngineerWork;

    public Boss(String name, int age, String position, String department, double rate, int resultEngineerWork) {
        super(name, age, position);
        this.department = department;
        this.rate = rate;
        this.resultEngineerWork = resultEngineerWork;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getResultEngineerWork() {
        return resultEngineerWork;
    }

    public void setResultEngineerWork(int resultEngineerWork) {
        this.resultEngineerWork = resultEngineerWork;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "department='" + department + '\'' +
                ", rate=" + rate +
                ", resultEngineerWork=" + resultEngineerWork +
                "} " + super.toString();
    }

    @Override
    public double getSalary() {
        if (resultEngineerWork <50){
            rate = rate;
        }
        if (50<resultEngineerWork && resultEngineerWork<80){
            rate = rate*1.5;
        }
        if (resultEngineerWork>80){
            rate=rate*2;
        }
        return rate;
    }
}
