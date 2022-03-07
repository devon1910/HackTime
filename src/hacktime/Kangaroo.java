
package hacktime;
import java.util.*;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class Kangaroo {
    public static void main(String[] args)
    {
        System.out.println(kangaroo(0,3,4,2));
        System.out.println("Bore");
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String ans="";
     if(x2>x1 && v2>v1)
     {
         ans="NO";
         return ans;
     }
     else if(x1>x2 && v1>v2)
     {
         ans="NO";
         return ans;
     }
     else
     {
         for(int i=0;i<10000;i++)
         {
             x1+=v1;
             x2+=v2;
             if(x1==x2)
             {
                 ans="YES";
                 break;
             }
             ans="NO";
         }
     }
     return ans;
    }
}
