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
public class DayOfTheProg {
    public static void main(String[] args)
    {
        System.out.println(dayOfProgrammer(1918));
    }
    static String dayOfProgrammer(int year) {
    int feb=0;
    if(year<1918)
    {
        if(year%4==0)
        {
            feb=29;
        }
        else{feb=28;}
    }
    else if(year==1918)
    {
        feb=15;
    }
    else
    {
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            feb=29;
        }
        else{feb=28;}
    }    
    int day=256-(31+feb+31+30+31+30+31+31);
    String date=day+".09."+year;
    return date;
    }
    
}
