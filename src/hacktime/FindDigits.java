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
public class FindDigits {
    public static void main(String[] args){
        System.out.println(findDigits(124));
    }
    public static int findDigits(int n) {
    // Write your code here
    int count=0;
    String num= String.valueOf(n);
    char[] digits= num.toCharArray();
    for(int i=0;i<digits.length;i++){
       int digit= digits[i]-'0';
       if(digit==0){break;}
       if(n%digit==0)count++; 
    }
        return count;
    }

}
