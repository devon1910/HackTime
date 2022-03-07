/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class CountValley {
    public static void main(String[] args){
       System.out.println(countingValleys(8,"DDUUUUDD"));
    }
    public static int countingValleys(int steps, String path) {
         int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : path.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                ++v;
            
    }
   return v;
}
}
