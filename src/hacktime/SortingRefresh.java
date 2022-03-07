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
public class SortingRefresh {
    public static void main(String[] args)
    {
         int [] arr= {78,45,34,7,66};
         int temp=0;
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++)//Terminates because the second loop checks
             {  if(arr[i]<arr[j]){
                 temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
                 }
             } 
             }
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
       }
             
 }
       

