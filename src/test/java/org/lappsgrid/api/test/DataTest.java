package org.lappsgrid.api.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.lappsgrid.api.Data;

import java.io.*;

/**
 * @author Keith Suderman
 */
public class DataTest {

  @Test
  public void testAsBytes() {
    byte[] expected = { 0, 1, 2, 3, 4 };
    Data data = new Data("raw", expected);
    byte[] actual = data.asBytes();
    assertTrue(actual.length == expected.length);
    for (int i = 0; i < expected.length; ++i) {
      assertTrue(actual[i] == expected[i]);
    }
  }

  @Test
  public void testStringAsBytes() throws UnsupportedEncodingException {
    byte[] expected = "hello world".getBytes();
    Data data = new Data("text", expected);
    byte[] actual = data.asBytes();
    assertTrue(actual.length == expected.length);
    assertTrue("hello world".equals(new String(actual)));
  }

   @Test
   public void testStringPayload()
   {
      String expected = "Hello world.";
      Data data = new Data("text", expected);
      assertTrue(expected.equals(data.getPayload()));
   }
}
