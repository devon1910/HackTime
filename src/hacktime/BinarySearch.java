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
public class BinarySearch {
    public static void main(String[] args)
    {
        int res=0;
        int [] arr={12,14,17,20,45,50,59,60,66,69,70,79};
        int beg=0,end=arr.length-1,mid=(int)((beg+end)/2);
        int key=14;
        while(beg<=end)
        {
            if(key==arr[mid])
            {
                res=mid;
                break;
            }
            else 
            {
                if(key<arr[mid])
                {
                    end=mid-1;
                    mid=(int)((beg+end)/2);
                }
                else
                {
                    beg=mid+1;
                    mid=(int)((beg+end)/2);
                }
            }
           // beg++;
        }
        System.out.println(res);
        
    }
}
