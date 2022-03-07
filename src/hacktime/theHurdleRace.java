/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import java.util.List;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class theHurdleRace {
    public static void main(String[] args){
        
    }
        
    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
       int no_of_dose=0;
       int max=height.get(0);
        for(int j=1;j< height.size()-1;j++){
            if(max< height.get(j)){
                max= height.get(j);
            }
        }
        no_of_dose=max-k;
        if(no_of_dose<=0){
            return 0;
        }
        return no_of_dose;
    }
}
