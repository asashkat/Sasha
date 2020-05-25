package ua.univer.task4;

public class Program {
    public static void main(String[] args) {
        /*interface Сотрудник ß class Инженер ß class Руководитель.*/
        Boss Tony = new Boss("Tony", 45, "Boss", "Technic", 2000, 60);
        Engineer Mike = new Engineer("Mike", 43, "Engineer", 12, 1300, 60);
        System.out.println(Tony.toString());
        System.out.println("Salary= "+Tony.getSalary());


    }
}
