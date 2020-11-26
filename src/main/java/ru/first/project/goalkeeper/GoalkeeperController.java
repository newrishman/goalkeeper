package ru.first.project.goalkeeper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoalkeeperController {

    /**
     * Контроллер, показывающий результат броска по воротам.
     *
     * @param shotPower     сила броска.
     * @param shotDirection направление броска.
     * @return результат броска: забил гол, вратарь отбил, либо промах.
     */
    @GetMapping("/start")
    public String forwardIndicators(@RequestHeader(name = "shotPower") int shotPower,
                                    @RequestHeader(name = "shotDirection") int shotDirection) {

        System.out.println("Входной параметр силы броска: " + shotPower
                + ", входной параметр направления броска: " + shotDirection);
        // тут должен быть код, отдающий входные параметры и возвращающий результат


        return "тут в итоге должен возвратиться результат";
    }
}