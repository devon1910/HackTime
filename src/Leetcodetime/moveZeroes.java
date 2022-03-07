/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcodetime;

import java.util.Arrays;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class moveZeroes {
    public static void main(String [] args){
        int[] arr= {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
}
}
