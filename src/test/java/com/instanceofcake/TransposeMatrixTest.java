package com.instanceofcake;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class TransposeMatrixTest {

  TransposeMatrix matrix;

  @Before
  public void setUp() throws Exception {
    matrix = new TransposeMatrix();
  }

 // @Test
  public void testThreeByThree() {
 
    int[][] input = {{0,0,1},
                      {0,1,0},
                      {0,1,1}};
    matrix.transpose(input);

  }
  
  @Test
  public void testFourByFour() {
 
    int[][] input = {{0,0,1,1},
                      {0,1,0,1},
                      {0,1,1,0},
                      {0,1,1,0}};
    matrix.transpose(input);

  }

}
