package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainIfAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        // В JUnit 4 порядок: expected, actual
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // Этот тест упадёт из-за бага в сервисе

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}