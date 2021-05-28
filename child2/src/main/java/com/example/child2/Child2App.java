package com.example.child2;

import com.example.child1.Child1App;

public class Child2App {
  public boolean returnChild1True() {
    return new Child1App().returnChild1True();
  }

  public boolean returnChild2True() {
    return true;
  }
}
