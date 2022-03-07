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
public class CatNMouse {
    public static void main(String[] args){
        System.out.println(catAndMouse(9,8,9));
    }
     static String catAndMouse(int x, int y, int z) {
     int res=Math.abs(x-z);
     int ans=Math.abs(y-z);
     if(res<ans){return "Cat A";}
     if(res==ans){return "Mouse C";}
     if(ans<res){ 
         return "Cat B";
     }
     return null;

    }
    
}
