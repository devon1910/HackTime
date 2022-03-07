/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import static hacktime.HackTime.converTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class MaxMin {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        int[] a = {1,2,1,2,1};
        int p=2;
        System.out.println(func(p,a));
    }
     static int func(int k, int[] arr){
         
         Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= arr.length - k; i++) 
            min = Math.min(min, arr[k + i - 1] - arr[i]);
        return min;
}
         
         
     }
//      int[] subArr=new int[k];
//      
//     
//      
//      
//      int max=subArr[0];
//      int min = subArr[0];
//      for(int i=1;i<=subArr.length-1;i++){
//          if(max<subArr[i]){
//              max = subArr[i];
//          }
//          if(min>subArr[i]){
//            min =arr[i];
//            }
//      }
//      
//      return (max-min);
//      
//     }

