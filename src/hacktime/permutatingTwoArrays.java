/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;
import java.util.*;
/**
 *
 * @author Ekpokpobe Davidson
 */
public class permutatingTwoArrays {
    public static void main(String[] args){
     List<Integer> a= new ArrayList<>();
     List<Integer> b= new ArrayList<>();
     a.add(0);a.add(1); 
     b.add(0); b.add(2);
     System.out.println(twoArrays(1,a,b));
    }
     public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
         int count=0;
         Collections.sort(A);
         Collections.sort(B,Collections.reverseOrder());
         for(int i=0; i<A.size();i++){
           if(A.get(i)+B.get(i)>=k)
           {
                count++;
           }
         }
         if(count ==A.size()){
             return "YES";
         }
         return "NO";
    }
}

