package ru.netology.javaqa.homeworkjava6.services;

public class VacationMonthsService {
    public int calculate(int income, int expenses) {
        int count = 0; //счётчик месяцев отдыха в году
        int treshold =0; //остаток денег на счету
        for (int month = 0; month < 12; month++) {
            if (treshold >= 150000) { //можем ли отдыхать?
                count++; //увеличение счётчика месяцев отдыха
                treshold = (treshold - expenses) / 3;
            } else {
                treshold = treshold + income - expenses;
            }

        }
        return count;
    }
}
