package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainIfAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        // В TestNG порядок параметров: actual, expected
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // Этот тест упадёт из-за бага в сервисе — это ожидаемо

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}