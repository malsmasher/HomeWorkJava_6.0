package ru.netology.javaqa.homeworkjava6.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import ru.netology.javaqa.homeworkjava6.services.VacationMonthsService;

public class VacationMonthsServiceTest {
    @Test
    public void testVacationMonthsService() {
        VacationMonthsService service = new VacationMonthsService();

        //подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int treshold = 150000;
        int expected = 2;

        //вызываем целевой метод:
        int actual = service.calculate(income, expenses, treshold);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacationMonthsService2() {
        VacationMonthsService service = new VacationMonthsService();

        //подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int treshold = 20000;
        int expected = 3;

        //вызываем целевой метод:
        int actual = service.calculate(income, expenses, treshold);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

}
