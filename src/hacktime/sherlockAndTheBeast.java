/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class sherlockAndTheBeast {

    public static void main(String[] args) {

        decentNumber(11);
    }

    public static void decentNumber(int n) {
        // Write your code here 
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int count = n;
        while (count % 3 != 0) {
            count -= 5;
        }
            if (count < 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < count; i++) {
                    str1.append("5");
                }
                for (int i = 0; i < (n - count); i++) {
                    str2.append("3");
                }
                System.out.println(str1.append(str2));
            }
        }
    }

