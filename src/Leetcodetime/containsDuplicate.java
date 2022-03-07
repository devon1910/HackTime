/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcodetime;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class containsDuplicate {
    public static void main(String[] args){
        
        
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for (int i=0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    
}
