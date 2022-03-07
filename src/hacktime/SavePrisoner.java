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
public class SavePrisoner {
    public static void main(String[] args){
        System.out.println(saveThePrisoner(7,19,2));
        
        
    }
    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
     int last= ((m-1)+(s-1))%n +1;
     return last;
    }
}
