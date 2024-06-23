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
        int expected = 2;

        //вызываем целевой метод:
        int actual = service.calculate(income, expenses);

        //производим проверку
        Assertions.assertEquals(expected, actual);
    }

}
