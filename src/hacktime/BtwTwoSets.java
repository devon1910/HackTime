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
public class BtwTwoSets {
    public static void main(String[] args)
    {
      List<Integer> a=new ArrayList<>();
       List<Integer> b=new ArrayList<>();
       a.add(3);a.add(9);a.add(6);
       b.add(36);b.add(72);
       System.out.println(getTotalX(a,b));
        
    }
    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;
            System.out.println(i);
            }
        }
        return count;
    }
    
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    //Finding the GCD
    private static int gcd(List<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            result = gcd(result, input.get(i));
        }
        return result;
    }
    //Finding the LCM
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    
    //looping through each element
    private static int lcm(List<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            result = lcm(result, input.get(i));
        }
        return result;
    }
}
