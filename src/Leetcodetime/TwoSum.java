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
public class TwoSum {
    public static void main(String[] args){
         int t=10;
         int[] num={2,5,5,11};
         int[] ans= twoSum(num,t);
         for(int i=0;i<ans.length;i++){
             System.out.print(ans[i]+" ");
         }
         
    }
     public static int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map= new HashMap<Integer,Integer>();
      
      for(int i=0;i<nums.length;i++){
          int complement= target-nums[i];
          if(map.containsKey(complement)){
              return new int[]{map.get(complement),i};
          }
          map.put(nums[i], i);
      }
      
       return null;
   }
}   
      
       //BRUTE FORCE
//      int[] indices=new int[2];
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                indices[0]=i;
//                indices[1]=j;
//                
//                return indices;
//            } 
//          }
//        }
//      return indices;

