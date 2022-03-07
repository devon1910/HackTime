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
public class MigratoryBirds {
    public static void main(String[] args)
    {
        List<Integer> arr= new ArrayList<>();
        arr.add(2);arr.add(4);arr.add(3);arr.add(2);arr.add(3);arr.add(1);
        arr.add(2);arr.add(1);arr.add(3);arr.add(3);
       
       System.out.println(migratoryBirds(arr));
    }
    static int migratoryBirds(List<Integer> arr) {
        int count1=0,count2=0,count3=0,count4=0,count5=0;
      for(int i=0;i<arr.size();i++)
      {
          if(arr.get(i)==1)count1++;
          else if(arr.get(i)==2)count2++;
          else if(arr.get(i)==3)count3++;
          else if(arr.get(i)==4)count4++;
          else if(arr.get(i)==5)count5++;
         
      }
      int []myarr={count1,count2,count3,count4,count5};
     // Arrays.sort(myarr);
      int max=0;
      int rez=0;
     // System.out.println(myarr);
      for(int i=0;i<myarr.length;i++)
      {
          if(max<myarr[i])
          {
              max=myarr[i];
              rez=i+1;
          }
          else if(max==myarr[i])
          {
            rez=rez; 
          }
          
      }
      return rez;
    }
}
