/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcodetime;

import java.util.*;
/**
 *
 * @author Ekpokpobe Davidson
 */
public class MaxSubArr {
    public static void main(String[] args){
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
 
        for (int i = 0; i < size; i++)
        {
            sum = sum + nums[i];
            if (max< sum)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
