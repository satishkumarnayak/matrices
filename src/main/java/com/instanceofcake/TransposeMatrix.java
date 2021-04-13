package com.instanceofcake;

import java.util.Arrays;

public class TransposeMatrix {

  public int[][] transpose(int[][] input) {
    int[][] output = new int[input.length][input.length];
    printMatrix(input);

    for (int row = 0; row < input.length; row++) {
      for (int col = 0; col < input[row].length; col++) {
        if(input[row][col] == 1) {
          output[col][row] = 1;
        }
      }
    }


    printMatrix(output);
    return output;
  }

  public void printMatrix(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      System.out.println(Arrays.toString(matrix[row]));
    }
  }
}
