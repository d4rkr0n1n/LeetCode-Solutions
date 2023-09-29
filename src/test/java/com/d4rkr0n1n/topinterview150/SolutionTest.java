package com.d4rkr0n1n.topinterview150;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    // 88. Merge Sorted Array
    @Nested
    class testMerge {

        int nums1[], nums2[], m, n, expected[];

        // Test Case 1
        @Test
        void case_1() {
            nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
            m = 3;
            nums2 = new int[] { 2, 5, 6 };
            n = 3;
            expected = new int[] { 1, 2, 2, 3, 5, 6 };
            test();
        }

        // Test Case 2
        @Test
        void case_2() {
            System.out.println("FirstNestedClass.test()");
            nums1 = new int[] { 1 };
            m = 1;
            nums2 = new int[] {};
            n = 0;
            expected = new int[] { 1 };
            test();
        }

        // Test Case 3
        @Test
        void case_3() {
            System.out.println("FirstNestedClass.test()");
            nums1 = new int[] { 0 };
            m = 0;
            nums2 = new int[] { 1 };
            n = 1;
            expected = new int[] { 1 };
            test();
        }

        void test() {
            solution.merge(nums1, m, nums2, n);
            assertArrayEquals(expected, nums1);
        }
    }

    // 27. Remove Element
    @Nested
    class testRemoveElement {

        int nums[],val,expected;

        @Test
        void case_1() {
            nums = new int[] { 3,2,2,3 }; 
            val = 3; 
            expected = 2;
            test();
        }

        @Test
        void case_2() {
            nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }; 
            val = 2; 
            expected = 5;
            test();
        }

        void test(){
            assertEquals(expected, solution.removeElement(nums, val));
            assertTrue(IntStream.range(0, nums.length)
                    .filter(i -> nums[i] == val)
                    .findFirst()
                    .orElse(-1) >= expected);
        }
    }
}
