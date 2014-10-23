package com.test;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting implements Serializable {

  private static final long serialVersionUID = -2595391091879137927L;
  private final long id;
  private final String content;

  Greeting() {
    id = 0;
    content = null;
  }

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  @XmlElement
  public long getId() {
    return id;
  }

  @XmlElement
  public String getContent() {
    return content;
  }
}