package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {
    @Test
    void test_locale_Russia () {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Assertions.assertEquals(localizationService.locale(Country.RUSSIA), "Добро пожаловать");
    }
    @Test
    void test_locale_Brazil () {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Assertions.assertEquals(localizationService.locale(Country.BRAZIL), "Welcome");
    }
}
