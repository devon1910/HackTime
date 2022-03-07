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
public class BreaknRecords {
      public static void main(String[] args)
      {
          int[] scores={10,5,20,20,4,5,2,25,1};
          //Take note
      System.out.println(Arrays.toString(breakingRecords(scores)));
      }
       static int[] breakingRecords(int[] scores) {
           int max=scores[0],min=scores[0];
           int countmax=0,countmin=0;
           for(int i =0; i<scores.length;i++)
           {
               if(max<scores[i])
               {
                   max=scores[i];
                   countmax++;
               }
               else if(min>scores[i])
               {
                   min = scores[i];
                   countmin++;
               }
               
           }
           int[] ans={countmax,countmin};
            return ans;
       }
}
