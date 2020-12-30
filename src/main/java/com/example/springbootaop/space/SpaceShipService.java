package com.example.springbootaop.space;

import com.example.springbootaop.space.aop.ManipulateSpaceShip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpaceShipService {

    @ManipulateSpaceShip
    public SpaceShip defaultShip(){
        log.info("Default ship is being made and returned");
        SpaceShip spaceShip = new SpaceShip("Pyramid", "Mike", 40);
        return spaceShip;
    }
}
