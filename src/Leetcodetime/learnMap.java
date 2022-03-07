/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcodetime;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class learnMap {
    public static void main(String[] args){
        int[] arr={2,3,3,2,6,8,9};
    
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
 //////IMPLEMENTATION WITH MAPS       
        //  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsValue(arr[i])){
//                System.out.println(arr[i]);
//                break;
//        }
//            map.put(i, arr[i]);
//           System.out.println(map.values());
//       }
        
/////IMPLEMENTATION WITH SETS
//        Set<Integer> set= new HashSet<Integer>();
//        
//        for(int i=0;i<arr.length;i++){
//            if(set.contains(arr[i])){
//                System.out.println(arr[i]);
//                break;
//            }
//            if(i==arr.length-1){
//                System.out.println("Undefined");
//            }
//            set.add(arr[i]);
//        }
    }
}
