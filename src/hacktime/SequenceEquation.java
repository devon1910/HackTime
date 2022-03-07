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
public class SequenceEquation {
    public static void main(String[] args){
        List<Integer> l= new ArrayList<>();
        l.add(5);
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(4);
        
        System.out.println(permutationEquation(l));
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    List<Integer> values= new ArrayList<>();
    int j=1;
    for(int k=0; k< p.size();k++){
        if(p.contains(j)){
          int index= p.indexOf(j);
          int y= p.indexOf(index+1);
          values.add(y+1);
        }
        j++;
    }
  return values;
}

}