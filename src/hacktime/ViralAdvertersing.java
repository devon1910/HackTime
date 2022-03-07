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
public class ViralAdvertersing {
    public static void main(String[] args){
        System.out.println(viralAdvertising(3));
    }
    public static int viralAdvertising(int n) {
    double likes=0;
     double people=5;
     int total_likes=0;
     for(int i=0;i<n;i++){
        likes= Math.floor(people/2);
        people=likes*3;
        total_likes+=likes;
     }
      return total_likes;
   
    }
}
