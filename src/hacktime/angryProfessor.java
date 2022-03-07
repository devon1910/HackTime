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
public class angryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        int count =0;
        for(int i=0;i<a.size();i++){
            if(a.get(i) <= 0){
                count++;
            }
        }
        if(count>=k){
            return "NO";
        }
        return "YES";
    }
   
}
