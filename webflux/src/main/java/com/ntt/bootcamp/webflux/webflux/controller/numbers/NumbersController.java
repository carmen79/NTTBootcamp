package com.ntt.bootcamp.webflux.webflux.controller.numbers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class NumbersController {

    @GetMapping(path = "/numbers", produces = "text/event-stream")
    public Flux<Integer> numbers() {

        Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
        flux.subscribe(n -> NumbersSubscriber.print(n));
        flux.subscribe(n -> System.out.println("Subscriber 2: " + n));

        return flux;

    }
}
