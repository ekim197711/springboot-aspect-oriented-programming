package com.example.springbootaop.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpaceShipServiceTest {

    @Autowired
    SpaceShipService spaceShipService;

    @Test
    void defaultShip() {
        SpaceShip spaceShip = spaceShipService.defaultShip();
        System.out.println("We got this: \n" + spaceShip);
        Assertions.assertEquals("Susan", spaceShip.getCaptain());
        Assertions.assertEquals("Box", spaceShip.getModel());
        Assertions.assertEquals(100, spaceShip.getFuel());
    }
}