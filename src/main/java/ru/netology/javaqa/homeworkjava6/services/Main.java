package ru.netology.javaqa.homeworkjava6.services;

public class Main {
    public static void main(String[] args) {
        VacationMonthsService service = new VacationMonthsService();
        int income = 100000;
        int expenses = 60000;
        int treshold = 150000;
        int month = service.calculate(income, expenses, treshold);
        System.out.println("На отдых в этом году " + month + " месяца");
    }
}
