package com.test;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Config {

  public String getThread() {
    return "Thread: " + Thread.currentThread().getId();
  }
}
