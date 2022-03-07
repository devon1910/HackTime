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
public class AppleNOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples=0;
        int countOranges=0;
        for(int i=0;i<apples.length;i++){
         int sum=apples[i]+a;
         if(sum>=s && sum <=t){
             countApples++;
         }
        }
        for(int i=0;i<oranges.length;i++){
         int sum=oranges[i]+b;
         if(sum>=s && sum <=t){
             countOranges++;
         }
        }
     System.out.println(countApples);
     System.out.println(countOranges);
    }

    public static void main(String[] args){
        int[] x=new int[3];
        int[] v= new int[4];
      countApplesAndOranges(2,2,3,4,x,v);
}
}