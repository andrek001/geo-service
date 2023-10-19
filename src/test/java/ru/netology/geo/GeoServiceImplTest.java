package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class GeoServiceImplTest {

    @Test
    void test_byIp_Russia() {
        GeoService geoService = new GeoServiceImpl();
        Assertions.assertEquals(geoService.byIp("172.0.0.0").getCountry(), Country.RUSSIA);
    }
    @Test
    void test_byIp_USA() {
        GeoService geoService = new GeoServiceImpl();
        Assertions.assertEquals(geoService.byIp("96.1.2.3").getCountry(), Country.USA);
    }
    @Test
    void test_byIp_otherCountry() {
        GeoService geoService = new GeoServiceImpl();
        Assertions.assertNull(geoService.byIp("1.2.3.4").getCountry());
        //почему-то этот тест не проходит. Выскакивает NullPointerException
    }
}
