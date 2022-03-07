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
public class UtopianTree {
    public static void main(String[] args){
        
    }
    public static int utopianTree(int n) {
    int height=1;
     for(int i=1;i<=n;i++){
        if(i%2!=0){
            height*=2;
        }else{
            height+=1;
        }
     }
     return height;
     
    }
}
