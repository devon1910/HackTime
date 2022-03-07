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
public class FiboRecur {
    public static void main(String[] args)
    {
        //System.out.print(fib(6)+" ");
        int res=Factorial(6);//Factorial
         System.out.print(res+" ");
    }
   /* public static int fib(int n)
    {
        if(n==0|| n==1)//base case
        {
            return n;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }*/
    public static int Factorial(int n)
    {
        if(n<=0)
            return 1;
        else
          return (Factorial(n-1)*n);//i take the result of each function.
    }
}
