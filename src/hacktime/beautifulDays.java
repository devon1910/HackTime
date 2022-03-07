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
public class beautifulDays {
    public static void main(String[] args){
        //System.out.println(beautifulDays(20,23,6));
        int[] arr1= {1,9,2};
        int[] arr2 = new int[arr1.length+1];
        for(int i=0;i<arr1.length;i++){
            arr2[arr1[i]]=i;  
        }
        for(int i=0;i<arr2.length;i++) System.out.print(arr2[i]+ " ");
       
    }
    public static int beautifulDays(int i, int j, int k) {
        int days=0;
        for (int p = i; p <= j; p++) {
            int num = p;
            int rev = 0;
            int rem=0;
            while (num != 0) {
                rem = num%10;
                rev = (rev * 10) + rem;
                num = num / 10;
            }
            if ((Math.abs(p - rev) % k) == 0) {
                days++;
            }
        }
     return days;
    }
}
