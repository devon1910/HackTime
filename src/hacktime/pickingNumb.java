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
public class pickingNumb {
    public static void main(String[] args){
        List<Integer> k=new ArrayList<>();
        k.add(1);
        k.add(1);
        k.add(1);
        k.add(1);
        k.add(1);
       
        
        
        System.out.println(pickingNumbers(k));
    }
    public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int start=0,max=0;
    int i;
  
    for(i=0;i<a.size();i++){
        if(Math.abs(a.get(i)-a.get(start))>1){
            start=i;
        }
        max= Math.max(max, i-start+1);
    }
    return max;
    }
}
