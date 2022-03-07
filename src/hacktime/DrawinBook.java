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
public class DrawinBook {
    public static void main(String [] args){
    System.out.println(pageCount(6,2));
    }
    static int pageCount(int n, int p) {
        int front =p/2;
        int back=(n-2)-(p/2);
        if(front<back || front== back)
        {
            return front;
        }
        else
        {
            return back;
        }
       
//        int frontcount=0,backcount=0;
//        List<Integer> pages= new ArrayList<>();
//        for(int i=0,j=1;i<n;i++,j++)
//        {
//            pages.add(j);
//        }
//        //from front
//        for(int j=0,i=0;j<n;j+=2)
//        {
//            
//            if(pages.get(i)!=p && pages.get(i)==1)
//            {
//                frontcount++;
//                if(i>=1){i+=2;}
//                else{i++;}
//                continue;
//            }
//            else
//            {
//                if(pages.get(i)!=p && pages.get(j)!=p){frontcount++;}
//                else{break;}
//                if(i>=1){i+=2;}
//                else{i++;}
//            }
//        }
//        //from back
//        for(int i=n-2,j=n-1;j>0;i-=2,j-=2)
//        {  // backcount++;
//                if(pages.get(i)!=p && pages.get(j)!=p){
//                    backcount++;
//                }
//                else{break;}
//        }
//        if(frontcount<backcount || frontcount== backcount)
//        {
//            return frontcount;
//        }
//        else{return backcount;}
    }
}
