package ru.netology.javaqa.homeworkjava6.services;

public class VacationMonthsService {
    public int calculate(int income, int expenses, int treshold) {
        int count = 0; //счётчик месяцев отдыха в году
        int money = 0; //количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { //можем ли отдыхать?
                count++; //увеличение счётчика месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }

        }
        return count;
    }
}
