/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import java.util.Arrays;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class DivSumPairs {
    public static void main(String[] args)
    {
        int[] ar={2,8,6,8,4};
        System.out.println(divisibleSumPairs(5,3,ar));
    }
     static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
     for (int i=0;i<n;i++)
     {
         int sum=0;
         for(int p=i+1;p<n;p++)
         {
             sum=ar[i]+ar[p];
             if(sum%k==0)
             {
                 count++;
             }
         }
     }
     return count;
    }
}

