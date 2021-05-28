package com.example.child2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Child2AppTest {
  @Test
  void testChild1App() {
    assertTrue(new Child2App().returnChild1True());
  }

  @Test
  void testChild2App() {
    assertTrue(new Child2App().returnChild2True());
  }
}
