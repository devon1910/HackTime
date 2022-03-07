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
public class BirthChoc {
    public static void main(String[] args)
    {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);ans.add(4);//ans.add(1);ans.add(3);ans.add(2);
        System.out.println(birthday(ans,4,1));
    }
    static int birthday(List<Integer> s, int d, int m) {
    int ways=0; 
        for (int j = 0; j < s.size()-m+1; j++) {
            int count=0;
            for (int i = 0, p = j; i < m; i++, p++) {//BEAST!   
                count += s.get(p);
            }
            if (count == d) {
                    ways++;
            }       
        }
        return ways;
    }
}
