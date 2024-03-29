package dev.qvil.leaderboardapi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev.qvil.leaderboardapi.Greeting;

/**
 * GreetingController
 */
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

}