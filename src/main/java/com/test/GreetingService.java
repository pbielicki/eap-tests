package com.test;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(serviceName = "GreetingService")
public class GreetingService {

  private static AtomicInteger counter = new AtomicInteger(0);

  @Inject
  Config config;

  public Greeting sayHello(String text) {
    return new Greeting(counter.incrementAndGet(), config.getThread() + " " + text);
  }
}
