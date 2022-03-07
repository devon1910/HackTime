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
public class PriyankaandToys {
    public static void main(String[] args)
    { 
        List<Integer> w=new ArrayList<>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(5);
        w.add(10);
        w.add(11);
        w.add(12);
        w.add(13);
            System.out.println(toys(w));    
    }
    public static int toys(List<Integer> w) {
    int tracker=1;
    int minContainer=0;
    Collections.sort(w);
    System.out.println(w);
    List<Integer> weights=new ArrayList<>();
    int i=0;
    int bound=0;
    while(i<w.size()){
        bound=tracker +4;
        if(w.get(i)<bound){
            weights.add(w.get(i));
            i++;
        }
        else{
            tracker=w.get(i);
            minContainer+=1;
        }
    }
    System.out.println((weights));
    return minContainer;
    }
}
