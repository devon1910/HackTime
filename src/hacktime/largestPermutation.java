/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class largestPermutation {
    public static void main(String[] args){
      //  List<Integer> l= new ArrayList<Integer>();
      //  String s ="145 161 11 116 64 85 158 167 125 14 104 34 15 119 51 118 63 188 166 113 114 194 126 53 133 109 48 40 32 52 108 62 153 105 44 129 89 186 45 73 115 66 130 56 141 197 36 192 107 24 22 152 81 137 111 101 100 144 9 16 31 154 198 159 70 179 50 172 39 155 79 37 87 69 121 134 93 7 5 17 110 122 96 103 177 193 95 33 164 71 143 82 77 75 162 191 102 19 91 94 157 184 35 23 99 180 182 6 59 176 146 13 165 135 3 4 195 112 189 30 27 168 123 41 57 136 190 29 132 76 38 1 10 83 124 163 20 117 178 2 42 84 12 171 67 43 58 183 8 138 68 149 131 47 74 60 80 90 78 160 169 21 61 187 92 25 181 147 88 106 55 97 150 120 128 139 140 175 26 127 173 185 65 196 86 28 98 54 142 18 151 46 49 170 174 156 148 72";
        String s= "1 7 2";
        String[] str= s.split(" ");
        Integer[] intArray = new Integer[str.length];
        for (int p = 0; p < str.length; p++) {
            intArray[p] = Integer.parseInt(str[p]);
        }

        List<Integer> intList = Arrays.asList(intArray);
        
        System.out.println(largestPermutation(1,intList));
    }
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        //ALGORITHM FOR HACKARRANK
//        int n = arr.size();
//        int[] index = new int[n+1];
//        for (int i = 0; i < n; i++) {          
//            index[arr.get(i)] = i;
//        }
//        for (int i = 0; i < n && k > 0; i++) {
//            if (arr.get(i) == n - i) {
//                continue;
//            }
//            arr.set(index[n - i], arr.get(i));
//            index[arr.get(i)] = index[n - i];
//            arr.set(i, n - i);
//            index[n - i] = i;       
//            k--;
//           // System.out.print("Arr after swap: "+arr.get(i));
//        }
//        return arr;

        
        
        
        
        
        
//      int[] array= arr.toArray();
//        if(k>=arr.size()){
//             Collections.sort(arr, Collections.reverseOrder());
//             return arr;
//        }
//        
       //  System.out.println("k: "+k);
        
       //ROBUST ALGORITHM FOR ALL INPUTS OF ANY KIND
       for(int i=0;i<k;i++){
            int largestIndex=0; 
            int j=i;
            int n=0;
            int max=arr.get(i);
            largestIndex=i;
            for(j=i, n=j+1;j<arr.size()-1;j++,n++){//FINDING MAXIMUM VALUE
                if(arr.get(n)>max){
                    max=arr.get(n);
                    largestIndex=n;
                }
            }
            int temp= arr.get(largestIndex);
            arr.set(largestIndex, arr.get(i));
            arr.set(i, temp);
        }
      // System.out.println("count is: "+count);
       return arr;
    }
}