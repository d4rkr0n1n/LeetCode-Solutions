package com.d4rkr0n1n.topinterview150;

import java.util.Arrays;

public class Solution {

  // 88. Merge Sorted Array
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
  }
  
}