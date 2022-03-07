/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import java.util.*;


/**
 *
 * @author Ekpokpobe Davidson
 */
public class SockMerchant {
    public static void main(String[] args)
    {
        int[] ar={6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};
        System.out.println(sockMerchant(15,ar));
    }
    static int sockMerchant(int n, int[] ar) {
        int pairs=0;
     
        Set<Integer> socks = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(!socks.contains(ar[i])){
                socks.add(ar[i]);
            }
            else{
                pairs++;
                socks.remove(ar[i]);
            }
        }
        return pairs;
        
    }
        
        
}
