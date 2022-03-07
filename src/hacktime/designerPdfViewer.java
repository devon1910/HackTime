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
public class designerPdfViewer {
    public static void main(String[] args){
        String b = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7";
        String[] bb= b.split(" ");
        Integer[] intArray = new Integer[bb.length];
        for (int p = 0; p < bb.length; p++) {
            intArray[p] = Integer.parseInt(bb[p]);
        }

        List<Integer> intList = Arrays.asList(intArray);
        
        System.out.println(designerPdfViewer(intList,"zaba"));
    }
    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
        String str="a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] words= word.split("");
        String[] letters= str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<h.size();i++){
            map.put(letters[i], h.get(i));
        }
        int max=map.get(words[0]);
        for(int i=1;i<words.length-1;i++){
            if(max<map.get(words[i])){
                max= map.get(words[i]);
            }
        }
        return (max * words.length);
    }

}
