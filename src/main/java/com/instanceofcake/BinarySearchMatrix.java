package com.instanceofcake;

public class BinarySearchMatrix {

  public boolean search(int[][] input, int target) {

    return false;
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
