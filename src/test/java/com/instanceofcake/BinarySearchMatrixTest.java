package com.instanceofcake;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchMatrixTest {

  BinarySearchMatrix binarySearch;

  @Before
  public void setUp() throws Exception {
    binarySearch = new BinarySearchMatrix();
  }

  @Test
  public void testBinarySearch() {
    int[][] input = {{1, 2, 5, 7},
                    {8, 9, 10, 12},
                     {15, 20, 25, 26}};


    assertTrue(binarySearch.search(input, 9));
    assertTrue(binarySearch.search(input, 8));
    assertTrue(binarySearch.search(input, 10));
    assertTrue(binarySearch.search(input, 12));
    assertTrue(binarySearch.search(input, 1));
    assertTrue(binarySearch.search(input, 15));

    assertFalse(binarySearch.search(input, 27));
    assertFalse(binarySearch.search(input, 0));

  }

  // @Test
  public void testBS() {
    int[] input = {1, 2, 5, 7};

    assertTrue(binarySearch.binarySearch(input, 0, 3, 2));
    assertTrue(binarySearch.binarySearch(input, 0, 3, 1));
    assertTrue(binarySearch.binarySearch(input, 0, 3, 5));
    assertTrue(binarySearch.binarySearch(input, 0, 3, 7));
    assertFalse(binarySearch.binarySearch(input, 0, 3, 8));
    assertFalse(binarySearch.binarySearch(input, 0, 3, -1));
  }


}
