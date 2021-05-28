package com.example.child4;

import com.example.child1.Child1App;
import com.example.child2.Child2App;

public class Child4App {
  public boolean returnChild1True() {
    return new Child1App().returnChild1True();
  }

  public boolean returnChild2True() {
    return new Child2App().returnChild2True();
  }

  public boolean returnChild4True() {
    return true;
  }
}
