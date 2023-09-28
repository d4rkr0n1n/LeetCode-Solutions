package com.d4rkr0n1n;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();
  
  @Test
  public void testMerge() {
    int nums1[], nums2[], m, n;

    // Test Case 1
    nums1 = new int[]{1,2,3,0,0,0};
    m = 3;
    nums2 = new int[]{2,5,6};
    n= 3;
    solution.merge(nums1, m, nums2, n);
    assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    
    // Test Case 2
    nums1 = new int[]{1};
    m = 1;
    nums2 = new int[]{};
    n = 0;
    solution.merge(nums1, m, nums2, n);
    assertArrayEquals(new int[]{1}, nums1);
    
    // Test Case 3
    nums1 = new int[]{0};
    m = 0;
    nums2 = new int[]{1};
    n = 1;
    solution.merge(nums1, m, nums2, n);
    assertArrayEquals(new int[]{1}, nums1);
    
  }
}
