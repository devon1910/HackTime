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
public class GradingStud {
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> ans=new ArrayList<>();
    for(int i=0;i<grades.size();i++)
    {
        if(grades.get(i)<38){
            ans.add(grades.get(i));
        }
        else if (grades.get(i)%5==0){
           // int newVal=+5;
            ans.add(grades.get(i));//Always stick to instructions
            }
        else if(grades.get(i)%5!=0){
            int p= grades.get(i);
            do{
                p++;
            }while((p%5)!=0);
            System.out.println(p);
            int diff=p-grades.get(i);
            //if(diff<3){ans.add(p);}
            //else{ans.add(grades.get(i));}
            ans.add(diff<3 ? p:grades.get(i));
        }
    }
    return ans;
    }   
    public static void main(String[]args){
       List<Integer> ans=new ArrayList<>();
       ans.add(12);
       ans.add(72);
       ans.add(85);
       ans.add(76);
       ans.add(72);
       ans.add(56);
       System.out.println("Hell");
       System.out.println(gradingStudents(ans));
       
       
}
}
