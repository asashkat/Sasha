package ua.univer.task4;

public class Engineer extends Person implements Employee{
    private int id;
    private double rate;
    private double resultWork;

    public Engineer(String name, int age, String position, int id, double rate, double resultWork) {
        super(name, age, position);
        this.id = id;
        this.rate = rate;
        this.resultWork = resultWork;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getResultWork() {
        return resultWork;
    }

    public void setResultWork(double resultWork) {
        this.resultWork = resultWork;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", rate=" + rate +
                ", resultWork=" + resultWork +
                "} " + super.toString();
    }

    @Override
    public double getSalary() {
        if (resultWork <50){
            rate = rate;
        }
        if (50<resultWork && resultWork<80){
            rate = rate*1.3;
        }
        if (resultWork>80){
            rate=rate*1.5;
        }
        return rate;
    }
}

