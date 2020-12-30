package com.example.springbootaop.space.aop;

import com.example.springbootaop.space.SpaceShip;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Slf4j
public class ManipulatorComponent {

    @Around("@annotation(ManipulateSpaceShip)")
    public Object doStuff(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Manipulate spaceship BEGIN");
        Object proceed = joinPoint.proceed();
        if (proceed instanceof SpaceShip) {
            SpaceShip spaceShip = (SpaceShip) proceed;
            spaceShip.setCaptain("Susan");
            spaceShip.setModel("Box");
            spaceShip.setFuel(100);
            log.info("Manipulate spaceship END");
            return spaceShip;
        } else {
            log.info("Manipulate spaceship END Not a spaceship");
            return proceed;
        }


    }

}
