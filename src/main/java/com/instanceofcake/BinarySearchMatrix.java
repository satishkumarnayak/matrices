package com.instanceofcake;

import java.util.Arrays;

public class BinarySearchMatrix {

  public boolean search(int[][] input, int target) {
    boolean result = false;
    int low = 0;
    int high = input.length;
    int mid = low + high / 2;
    int output = 99;
    while (low < high && mid < high) {

      output = binarySearch2(input[mid], 0, input[mid].length - 1, target);
      if(output == 0) {
        result = true;
        break;
      }
        

      else if(output == -1) {
        
        high = mid;
        mid = low + high /2;
        
      } 
    
      else if(output == 1) {
        low = mid;
        mid = low + high /2; 
       
      }
     
     
    }

    return result;
  }

  public int binarySearch2(int[] array, int start, int end, int target) {
    System.out.println(Arrays.toString(array));
    int mid = start + end / 2;
    int result = 99;
    if (start < end) {
      if (target == array[mid]) {
        result = 0;
      } else if (target < array[mid]) {
        end = mid;
        result = binarySearch2(array, start, end, target);
        if(result != 0)
          result = -1;
      } else if (target > array[mid]) {
        start = mid;
        result = binarySearch2(array, start, end, target);
        if(result != 0)
          result = 1;
      }
    }
    return result;
  }


  public boolean binarySearch(int[] array, int start, int end, int target) {
    int mid = start + end / 2;
    boolean result = false;
    if (start < end) {
      if (target == array[mid]) {
        result = true;
      } else if (target < array[mid]) {
        end = mid;
        result = binarySearch(array, start, end, target);
      } else if (target > array[mid]) {
        start = mid;
        result = binarySearch(array, start, end, target);
      }
    }
    return result;
  }

}
