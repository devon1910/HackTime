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
public class BonAppetit {
    public static void main(String[] args)
    {
        
    }
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
       for(int i =0;i<bill.size();i++)
       {
           if(i==k){continue;}
           else
           {
               sum+=bill.get(i);
           }
       }
       int Annas_bill=sum/2;
       if(Annas_bill==b)
       {
           
           System.out.print("Bon Appetit");
       }
       else{System.out.print(b-Annas_bill);}
    }
}
