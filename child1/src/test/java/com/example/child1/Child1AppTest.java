package com.example.child1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Child1AppTest {
  @Test
  void testChild1App() {
    assertTrue(new Child1App().returnChild1True());
  }
}
