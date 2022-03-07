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
public class ElecsShop {
    public static void main(String[] args){
      //  System.out.println(getMoneySpent(5,1,1));
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max= -1;
        for(int i=0;i<keyboards.length;i++){
            for(int j=0; j<drives.length;j++){              
              int sum=keyboards[i]+drives[j];
                if(sum<=b)
                {
                     if(sum>max)
                         max=sum;
                }
            }
        }
        return max;
    }
}
